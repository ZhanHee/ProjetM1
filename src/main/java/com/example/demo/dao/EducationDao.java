package com.example.demo.dao;

import com.example.demo.constant.CollectionNames;
import com.example.demo.model.Award;
import com.example.demo.model.Education;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
public class EducationDao {

    @Autowired
    private MongoTemplate mongoTemplate;

    public List<Education> findAll() {
        // 执行查询集合中全部文档信息
        List<Education> documentList = mongoTemplate.findAll(Education.class, CollectionNames.EDUCATION);
        // 输出结果
        for (Education education : documentList) {
            log.info("用户信息：{}", education);
        }
        return documentList;
    }

}
