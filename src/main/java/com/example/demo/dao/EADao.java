package com.example.demo.dao;

import com.example.demo.constant.CollectionNames;
import com.example.demo.model.Award;
import com.example.demo.model.EducationActivity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
public class EADao {

    @Autowired
    private MongoTemplate mongoTemplate;

    public List<EducationActivity> findAll() {
        // 执行查询集合中全部文档信息
        List<EducationActivity> documentList = mongoTemplate.findAll(EducationActivity.class, CollectionNames.EDUCATIONACTIVITIES);
        // 输出结果
        for (EducationActivity educationActivity : documentList) {
            log.info("用户信息：{}", educationActivity);
        }
        return documentList;
    }
}
