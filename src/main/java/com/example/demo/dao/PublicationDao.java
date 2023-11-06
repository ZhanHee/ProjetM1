package com.example.demo.dao;

import com.example.demo.constant.CollectionNames;
import com.example.demo.model.Enseignant;
import com.example.demo.model.Publication;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
public class PublicationDao {

    @Autowired
    private MongoTemplate mongoTemplate;

    public List<Publication> findAll() {
        // 执行查询集合中全部文档信息
        List<Publication> documentList = mongoTemplate.findAll(Publication.class, CollectionNames.PUBLICATION);
        // 输出结果
        for (Publication publication : documentList) {
            log.info("用户信息：{}", publication);
        }
        return documentList;
    }

}
