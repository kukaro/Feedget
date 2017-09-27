/**
 * 회원 정보 DB를 접근하는 CRUD 모뎅 작성
 */
package model.dao;

import java.util.ArrayList;

import org.bson.BasicBSONObject;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;
import com.mongodb.util.JSON;

import model.dto.UserDto;

public class UserDao {
	private static UserDao instance = new UserDao();
	private String MongoDB_IP = "127.0.0.1";
	private int MongoDB_PORT = 27017;
	private String DB_NAME = "service";
	
	private UserDao() {
		/*pass*/
	}

	public boolean insert(String name, String email, String password) {
		// Connect to MongoDB
		MongoClient mongoClient = new MongoClient(new ServerAddress(MongoDB_IP, MongoDB_PORT));
		DB db = mongoClient.getDB(DB_NAME);
		DBCollection collection = db.getCollection("user");

		// =========== Make Data01 by BasicDBObject ===========
		String json = "{'name':'" + name + "','email':'" + email + "','password':'" + password + "'}";
		DBObject dbObject = (DBObject) JSON.parse(json);

		collection.insert(dbObject);
		return true;
	}
	public boolean update(String email, String key, String value){
		
		MongoClient mongoClient = new MongoClient(new ServerAddress(MongoDB_IP, MongoDB_PORT));
		DB db = mongoClient.getDB(DB_NAME);
		DBCollection collection = db.getCollection("user");
		
		BasicDBObject updateQuery = new BasicDBObject().append("$set", new BasicDBObject().append(key, value));
	    BasicDBObject searchQuery = new BasicDBObject().append("email", email);
	    collection.update(searchQuery, updateQuery);

	    return true;
	}
	public boolean delete(String email){
		
		MongoClient mongoClient = new MongoClient(new ServerAddress(MongoDB_IP, MongoDB_PORT));
		DB db = mongoClient.getDB(DB_NAME);
		DBCollection collection = db.getCollection("user");
		
		BasicDBObject searchQuery = new BasicDBObject().append("email", email);
		collection.remove(searchQuery);
		
		return true;
	}
	public UserDto find(String email){
		
		MongoClient mongoClient = new MongoClient(new ServerAddress(MongoDB_IP, MongoDB_PORT));
		DB db = mongoClient.getDB(DB_NAME);
		DBCollection collection = db.getCollection("user");
		UserDto userDto;
		
		BasicDBObject searchQuery = new BasicDBObject().append("email", email);
		DBObject dbObject = collection.findOne(searchQuery);
		userDto = new UserDto(((BasicBSONObject) dbObject).getString("name"),((BasicBSONObject) dbObject).getString("email"),((BasicBSONObject) dbObject).getString("password"));
        System.out.println(((BasicBSONObject) dbObject).getString("password"));

		return userDto;
	}

	public static UserDao getInstance() {
		return instance;
	}
}
