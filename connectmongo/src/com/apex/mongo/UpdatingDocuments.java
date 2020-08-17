package com.apex.mongo;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;

public class UpdatingDocuments {
	public static void main(String[] args) {
		// creating MongoClient
		MongoClient mongo = new MongoClient("localhost", 27017);

		// creating credentials
		MongoCredential credential;
		credential = MongoCredential.createCredential("sampleUser", "user", "password".toCharArray());
		System.out.println(" Connected to DB successfully ");

		// Accessing the database
		MongoDatabase database = mongo.getDatabase("user");

		// retrieving a collection
		MongoCollection<Document> collection = database.getCollection("democollection");
		System.out.println(" collection selected succesfully ");

		// updating document in collection
		/*
		 * collection.updateOne(Filters.eq("first_name","Jerry"),Updates.set(
		 * "last_name", "Rielly"));
		 * System.out.println(" document updated succesfully ");
		 */
		
		//deleting document
		
		  collection.deleteOne(Filters.eq("first_name","Jerry"));
		  System.out.println(" document deleted succesfully ");
		 
	}
}
