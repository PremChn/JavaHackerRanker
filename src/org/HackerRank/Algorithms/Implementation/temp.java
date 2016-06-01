package org.HackerRank.Algorithms.Implementation;

import java.util.Arrays;

import com.mongodb.BasicDBList;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;

public class temp{

	public static void main(String args[]) {
		/*MongoClient mongoClient = new MongoClient(new ServerAddress("localhost", 27017));
		DB db = mongoClient.getDB("local");
		DBCollection collection = db.getCollection("accountForecast");
		System.out.println(collection.count());
		
		mongoClient.close();*/
		
		int[] iArray = {9,3,7,8};
		int iArrayLength = iArray.length;
		for(int i = 0; i < iArrayLength; i++){
			System.out.println(iArray[i]);
		}
		System.out.println();
		Arrays.sort(iArray);
		System.out.println(iArray[iArrayLength - 1] - iArray[0]);
	}
}