package com.example.demo.dao;

import com.example.demo.constant.CollectionNames;
import com.example.demo.model.ScentificActivity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
public class SADao {

    @Autowired
    private MongoTemplate mongoTemplate;

    public List<ScentificActivity> findAll() {
        // 执行查询集合中全部文档信息
        List<ScentificActivity> documentList =
                mongoTemplate.findAll(ScentificActivity.class, CollectionNames.SCENTIFICACTIVITIES);
        // 输出结果
        for (ScentificActivity scentificActivity : documentList) {
            log.info("用户信息：{}", scentificActivity);
        }
        return documentList;
    }
}
