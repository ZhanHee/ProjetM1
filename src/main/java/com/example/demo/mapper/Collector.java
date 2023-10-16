package com.example.demo.mapper;

import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import org.bson.Document;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
public class Collector {

    private static Logger logger = LoggerFactory.getLogger(Collector.class);

    private MongoClient mongoClient;

    public Collector(MongoClient mongoClient){
        this.mongoClient = mongoClient;
    }

    @Before
    public void before() {
        mongoClient = new MongoClient( "10.12.48.82" , 27017);
    }

    @After
    public void after() {
        if (mongoClient != null) {
            mongoClient.close();
        }
    }

    /**
     * 获取数据库，没有会创建
     */

    public MongoDatabase getDatabase(String dbName) {
        MongoDatabase mongoDatabase = mongoClient.getDatabase(dbName);
        logger.info("Database Name: " + mongoDatabase.getName());
        return mongoDatabase;
    }

    /**
     * 删除数据库
     */
    @Test
    public void dropDatabase() {
        mongoClient.dropDatabase("testdb");
    }

    /**
     * 创建集合
     */
    @Test
    public void createCollection() {
        MongoDatabase mongoDatabase = mongoClient.getDatabase("testdb");
        mongoDatabase.createCollection("col1");
    }

    /**
     * 获取集合
     */
    @Test
    public void getCollection() {
        MongoDatabase mongoDatabase = mongoClient.getDatabase("testdb");
        MongoCollection<Document> collection = mongoDatabase.getCollection("col1");
        logger.info(collection.countDocuments() + "");
    }

    /**
     * 删除集合
     */
    @Test
    public void dropCollection() {
        MongoDatabase mongoDatabase = mongoClient.getDatabase("testdb");
        MongoCollection<Document> collection = mongoDatabase.getCollection("col1");
        collection.drop();
    }

    /**
     * 插入文档
     */
    @Test
    public void insertDocumnet() {
        MongoDatabase mongoDatabase = mongoClient.getDatabase("testdb");
        MongoCollection<Document> collection = mongoDatabase.getCollection("col1");

        List<Document> documents = new ArrayList<Document>();
        Document document1 = new Document("name", "jack").append("age", 20);
        Document document2 = new Document("luci", "luci").append("age", 21);
        documents.add(document1);
        documents.add(document2);
        collection.insertMany(documents);
    }

    /**
     * 查询文档
     */
    @Test
    public void findDocumnet() {
        MongoDatabase mongoDatabase = mongoClient.getDatabase("testdb");
        MongoCollection<Document> collection = mongoDatabase.getCollection("col1");

        //查询所有
        FindIterable<Document> iterable = collection.find();
        MongoCursor<Document> cursor = iterable.iterator();
        while (cursor.hasNext()) {
            logger.info("1:" + cursor.next().toJson());
        }

        //order by name limit 2,3 (对应mysql语法，从第二条记录[即跳过第一条]开始，查询三条记录)
        iterable = collection.find().sort(new BasicDBObject("name", 1)).skip(1).limit(3);
        cursor = iterable.iterator();
        while (cursor.hasNext()) {
            logger.info("2:" + cursor.next().toJson());
        }

        //where name='jack'
        BasicDBObject query = new BasicDBObject();
        query.put("name", "jack");
        iterable = collection.find(query);
        cursor = iterable.iterator();
        while (cursor.hasNext()) {
            logger.info("3:" + cursor.next().toJson());
        }

        //where age in(20,21)
        query = new BasicDBObject();
        List<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(21);
        query.put("age", new BasicDBObject("$in", list));
        iterable = collection.find(query);
        cursor = iterable.iterator();
        while (cursor.hasNext()) {
            logger.info("4:" + cursor.next().toJson());
        }

        //where age>10 and age<30
        query = new BasicDBObject();
        query.put("age", new BasicDBObject("$gt", 10).append("$lt", 30));
        iterable = collection.find(query);
        cursor = iterable.iterator();
        while (cursor.hasNext()) {
            logger.info("5:" + cursor.next().toJson());
        }

        //where age!=10
        query = new BasicDBObject();
        query.put("age", new BasicDBObject("$ne", 10));
        iterable = collection.find(query);
        cursor = iterable.iterator();
        while (cursor.hasNext()) {
            logger.info("6:" + cursor.next().toJson());
        }

        //where name='jack' and age=20
        List<BasicDBObject> queryList = new ArrayList<>();
        queryList.add(new BasicDBObject("name", "jack"));
        queryList.add(new BasicDBObject("age", 20));
        query = new BasicDBObject();
        query.put("$and", queryList);
        iterable = collection.find(query);
        cursor = iterable.iterator();
        while (cursor.hasNext()) {
            logger.info("7:" + cursor.next().toJson());
        }
    }

    /**
     * 更新文档
     */
    @Test
    public void updateDocumnet() {
        MongoDatabase mongoDatabase = mongoClient.getDatabase("testdb");
        MongoCollection<Document> collection = mongoDatabase.getCollection("col1");

        collection.updateMany(Filters.eq("name", "jack"), new Document("$set",new Document("age", 22)));
    }


    /**
     * 删除文档
     */
    @Test
    public void deleteDocumnet() {
        MongoDatabase mongoDatabase = mongoClient.getDatabase("testdb");
        MongoCollection<Document> collection = mongoDatabase.getCollection("col1");

        collection.deleteOne(Filters.eq("name", "jack"));
    }
}
