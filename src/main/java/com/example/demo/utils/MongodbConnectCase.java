package com.example.demo.utils;


import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoIterable;
import org.testng.annotations.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Iterator;

import com.example.demo.mapper.Collector;

public class MongodbConnectCase {
    private static Logger logger = LoggerFactory.getLogger(MongodbConnectCase.class);

    /**
     * 连接单个地址
     */
    @Test
    public void connectSingle() {
        MongoClient mongoClient = null;
        try {
            mongoClient = new MongoClient( "10.12.48.82" , 27017);
//            MongoIterable<String> databaseNames = mongoClient.listDatabaseNames();
            Collector collector = new Collector(mongoClient);
            String dbName = "testDB";
            MongoDatabase database = collector.getDatabase(dbName);
            System.out.println(database);
        } finally {
            if (mongoClient != null) {
                mongoClient.close();
            }
        }
    }


    /**
     * 用户名密码验证

    @Test
    public void connectAuth() {
        MongoClient mongoClient = null;
        try {
            ServerAddress serverAddress = new ServerAddress("10.49.196.10", 27017);
            //指定用户名、用户所在数据库(不是角色对应的数据库)、密码
            MongoCredential credential = MongoCredential.createCredential("test2", "config", "123456".toCharArray());

            mongoClient = new MongoClient(serverAddress, credential, MongoClientOptions.builder().build());
            MongoIterable<String> databaseNames = mongoClient.listDatabaseNames();
            Iterator<String> iterator = databaseNames.iterator();
            while (iterator.hasNext()) {
                logger.info(iterator.next());
            }
        } finally {
            if (mongoClient != null) {
                mongoClient.close();
            }
        }
    }
    */
}
