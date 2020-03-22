package com.maxphillipsdev.trueconomy.utils;

import com.maxphillipsdev.trueconomy.Trueconomy;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.bson.conversions.Bson;

public class MongoConnect
{
	private MongoDatabase database;
	private MongoCollection playerData;
	private Trueconomy plugin = Trueconomy.getPlugin();

	public void connect()
	{
		MongoClient client = MongoClients.create(plugin.getConfig().getString("connection-string"));
		setDatabase(client.getDatabase("Trueconomy"));
		setPlayerData(database.getCollection("PlayerData"));

		MessageManager.consoleGood("Connected to Trueconomy DB successfully.");
	}

	public void setPlayerDataDocument(Object value, String key, String uuid)
	{
		Document document = new Document("uuid", uuid);
		Bson newValue = new Document(key, value);
		Bson updateOperation = new Document("$set", newValue);
		playerData.updateOne(document, updateOperation);
	}

	public Object getPlayerDataDocument(String key, String uuid)
	{
		Document document = new Document("uuid", uuid);
		if (playerData.find(document).first() != null)
		{
			Document found = (Document) playerData.find().first();
			return found.get(key);
		}

		MessageManager.consoleBad("Document is null for uuid: "+ uuid);
		return null;
	}

	public MongoCollection getPlayerData()
	{
		return playerData;
	}

	public void setPlayerData(MongoCollection playerData)
	{
		this.playerData = playerData;
	}

	public MongoDatabase getDatabase()
	{
		return database;
	}

	public void setDatabase(MongoDatabase database)
	{
		this.database = database;
	}
}
