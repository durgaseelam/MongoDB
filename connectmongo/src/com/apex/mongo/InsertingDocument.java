package com.apex.mongo;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class InsertingDocument {
	public static void main(String[] args) {
		// creating MongoClient
		MongoClient mongo = new MongoClient("localhost", 27017);

		MongoDatabase database = mongo.getDatabase("user");
		// retrieving a collection
		MongoCollection<Document> collection = database.getCollection("democollection");
		System.out.println(" collection selected succesfully ");

		// inserting document in collection
		Document document = new Document("title", "democollection").append("first_name", "Jerry");
		collection.insertOne(document);
		System.out.println(" document inserted succesfully ");

	}
}