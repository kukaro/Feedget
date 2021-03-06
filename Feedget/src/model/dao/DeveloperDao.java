package model.dao;

import org.bson.BasicBSONObject;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;
import com.mongodb.util.JSON;

import model.dto.DeveloperDto;

public class DeveloperDao {
	/*
	 * Field
	 */
	private static DeveloperDao instance = new DeveloperDao();
	private String MongoDB_IP = "127.0.0.1";
	private int MongoDB_PORT = 27017;
	private String DB_NAME = "service";

	/*
	 * constructor
	 */
	private DeveloperDao() {
		/*pass*/
	}
	
	/*
	 * Method
	 */
	public boolean insert(String name, String company,String email, String password,String category,String site) {
		// Connect to MongoDB
		MongoClient mongoClient = new MongoClient(new ServerAddress(MongoDB_IP, MongoDB_PORT));
		DB db = mongoClient.getDB(DB_NAME);
		DBCollection collection = db.getCollection("developer");

		// =========== Make Data01 by BasicDBObject ===========
		String json = "{'name':'" + name + "','company':'" + company + "','email':'" + email + "','password':'" + password + "','category':'" + category + "','site':'" + site + "'}";
		DBObject dbObject = (DBObject) JSON.parse(json);

		collection.insert(dbObject);
		return true;
	}
	public boolean update(String email, String key, String value){
		
		MongoClient mongoClient = new MongoClient(new ServerAddress(MongoDB_IP, MongoDB_PORT));
		DB db = mongoClient.getDB(DB_NAME);
		DBCollection collection = db.getCollection("developer");
		
		BasicDBObject updateQuery = new BasicDBObject().append("$set", new BasicDBObject().append(key, value));
	    BasicDBObject searchQuery = new BasicDBObject().append("email", email);
	    collection.update(searchQuery, updateQuery);

	    return true;
	}
	public boolean delete(String email){
		
		MongoClient mongoClient = new MongoClient(new ServerAddress(MongoDB_IP, MongoDB_PORT));
		DB db = mongoClient.getDB(DB_NAME);
		DBCollection collection = db.getCollection("developer");
		
		BasicDBObject searchQuery = new BasicDBObject().append("email", email);
		collection.remove(searchQuery);
		
		return true;
	}
	public DeveloperDto find(String email){
		
		MongoClient mongoClient = new MongoClient(new ServerAddress(MongoDB_IP, MongoDB_PORT));
		DB db = mongoClient.getDB(DB_NAME);
		DBCollection collection = db.getCollection("developer");
		DeveloperDto developerDto;
		
		BasicDBObject searchQuery = new BasicDBObject().append("email", email);
		DBObject dbObject = collection.findOne(searchQuery);
		if(dbObject==null) {
			return null;
		}
		developerDto = new DeveloperDto(((BasicBSONObject) dbObject).getString("name"),((BasicBSONObject) dbObject).getString("company"),((BasicBSONObject) dbObject).getString("email"),((BasicBSONObject) dbObject).getString("password"),((BasicBSONObject) dbObject).getString("category"),((BasicBSONObject) dbObject).getString("site"));
        //System.out.println(((BasicBSONObject) dbObject).getString("password"));

		return developerDto;
	}
	public static DeveloperDao getInstance() {
		return instance;
	}
}
