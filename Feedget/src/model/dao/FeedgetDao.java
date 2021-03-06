package model.dao;

import org.bson.BasicBSONObject;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;
import com.mongodb.util.JSON;

import model.dto.FeedgetDto;

public class FeedgetDao {
	private static FeedgetDao instance = new FeedgetDao();
	private String MongoDB_IP = "127.0.0.1";
	private int MongoDB_PORT = 27017;
	private String DB_NAME = "service";

	private FeedgetDao() {
		/*pass*/
	}
	
	public boolean insert(String email, String name,String img, String comment,int color) {
		// Connect to MongoDB
		MongoClient mongoClient = new MongoClient(new ServerAddress(MongoDB_IP, MongoDB_PORT));
		DB db = mongoClient.getDB(DB_NAME);
		DBCollection collection = db.getCollection("feedget");

		// =========== Make Data01 by BasicDBObject ===========
		String json = "{'email':'" + email + "','name':'" + name + "','img':'" + img + "','comment':'" + comment + "','color':'" + color + "'}";
		DBObject dbObject = (DBObject) JSON.parse(json);

		collection.insert(dbObject);
		return true;
	}
	public boolean update(String email, String key, String value){
		
		MongoClient mongoClient = new MongoClient(new ServerAddress(MongoDB_IP, MongoDB_PORT));
		DB db = mongoClient.getDB(DB_NAME);
		DBCollection collection = db.getCollection("feedget");
		
		BasicDBObject updateQuery = new BasicDBObject().append("$set", new BasicDBObject().append(key, value));
	    BasicDBObject searchQuery = new BasicDBObject().append("email", email);
	    collection.update(searchQuery, updateQuery);

	    return true;
	}
	public boolean delete(String email){
		
		MongoClient mongoClient = new MongoClient(new ServerAddress(MongoDB_IP, MongoDB_PORT));
		DB db = mongoClient.getDB(DB_NAME);
		DBCollection collection = db.getCollection("feedget");
		
		BasicDBObject searchQuery = new BasicDBObject().append("email", email);
		collection.remove(searchQuery);
		
		return true;
	}
	public JsonArray find(String email){
		
		MongoClient mongoClient = new MongoClient(new ServerAddress(MongoDB_IP, MongoDB_PORT));
		DB db = mongoClient.getDB(DB_NAME);
		DBCollection collection = db.getCollection("feedget");
		FeedgetDto feedgetDto;
		
		BasicDBObject searchQuery = new BasicDBObject().append("email", email);
		DBCursor dbCursor = collection.find();
		JsonParser parser = new JsonParser();
		JsonArray jsArr = new JsonArray();
		JsonObject jsTmp;
        while(dbCursor.hasNext()){
        		DBObject dbO = dbCursor.next();
        		System.out.println(dbO.toString());
        		jsTmp = (JsonObject) parser.parse(dbO.toString());
        		jsArr.add(jsTmp);
        }
        return jsArr;
	}
	public JsonArray findAll() {
		MongoClient mongoClient = new MongoClient(new ServerAddress(MongoDB_IP, MongoDB_PORT));
		DB db = mongoClient.getDB(DB_NAME);
		DBCollection collection = db.getCollection("feedget");
		FeedgetDto feedgetDto;
		BasicDBObject searchQuery = new BasicDBObject();
		DBCursor dbCursor = collection.find();
		JsonParser parser = new JsonParser();
		JsonArray jsArr = new JsonArray();
		JsonObject jsTmp;
        while(dbCursor.hasNext()){
        		DBObject dbO = dbCursor.next();
        		System.out.println(dbO.toString());
        		jsTmp = (JsonObject) parser.parse(dbO.toString());
        		jsArr.add(jsTmp);
        }
        return jsArr;
	}
	public static FeedgetDao getInstance() {
		return instance;
	}

	public boolean insert(JsonObject jsObj) {
		try {
			MongoClient mongoClient = new MongoClient(new ServerAddress(MongoDB_IP, MongoDB_PORT));
			DB db = mongoClient.getDB(DB_NAME);
			DBCollection collection = db.getCollection("feedget");
			
			DBObject dbObject = (DBObject) JSON.parse(jsObj.toString());

			collection.insert(dbObject);
			return true;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return true;
	}
}
