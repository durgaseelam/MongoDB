package com.apex.mongo;



import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class CreatingCollection {
	public static void main(String[] args) {

		// creating MongoClient
		MongoClient mongo = new MongoClient("localhost", 27017);

		// creating credentials
		MongoCredential credential;
		credential = MongoCredential.createCredential("sampleUser", "user", "password".toCharArray());
		System.out.println(" Connected to DB successfully ");

		// Accessing the database
		MongoDatabase database = mongo.getDatabase("user");

		// creating a collection		
		database.createCollection("democollection");
		System.out.println("collection created succesfully");
		
		//retrieving a collection
		MongoCollection<Document> collection=database.getCollection("democollection");
		System.out.println(" collection selected succesfully ");
		
		
	}
}
