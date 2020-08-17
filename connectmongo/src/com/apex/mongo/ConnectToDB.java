package com.apex.mongo;
import com.mongodb.client.MongoDatabase;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;

public class ConnectToDB {
public static void main(String[] args) {
	//creating MongoClient 
	MongoClient mongo=new MongoClient("localhost",27017);
	
	//creating credentials
	MongoCredential credential;
	credential=MongoCredential.createCredential("sampleUser", "user","password".toCharArray());
	System.out.println(" Connected to DB successfully ");
	
	//Accessing the database
	MongoDatabase database=mongo.getDatabase("user");
	System.out.println("credentials "+credential);
	
}
}
