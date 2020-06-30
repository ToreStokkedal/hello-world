import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class HelloMongo {

	public HelloMongo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		new HelloMongo().run();

	}
	
	private void run() {
		String mongoHost = "192.168.39.249";
		String databaseName = "thedeveloper";
		String collectionName = "tweets";
		
//		String mongoHost = "192.168.39.249";
//		String database = "thedeveloper";
//		String collectionName = "persons";
		
		MongoClient mongoClient = null; 
		MongoDatabase dbDatabase = null;
		MongoCollection<Document> collection = null;
		
	
		connect();;


		/*
		 * Add record
		 */
		public void addRecord(String record) throws Exception{
			try {
				connect();
				Document doc = new Document(Document.parse(record));
				collection.insertOne(doc);
				log.info("Inserted tweet to Mongo" + doc.toString());
			} catch (Exception e) {
				log.error("Error insering record: " + e.getMessage());
				e.printStackTrace();
			}
		}

		/**
		 * Connect with default / configed parameters
		 */
		

	}
	
	@Override
	protected void finalize() throws Throwable {
		mongoClient.close();
		super.finalize();
	}

	public void connect(){
		try {
			mongoClient = new MongoClient(mongoHost, 27017);
			dbDatabase = mongoClient.getDatabase(databaseName);
			collection = dbDatabase.getCollection(collectionName);
			log.info("Connected to " + databaseName);

		} catch (Exception e) {
			log.info("Error when opening db" + e.getMessage());
			e.printStackTrace();
		}
	}
	}

}
