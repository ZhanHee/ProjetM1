package com.example.demo.dao;

import com.example.demo.constant.CollectionNames;
import com.example.demo.model.ExperienceProfessionelle;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
public class EPDao {

    @Autowired
    private MongoTemplate mongoTemplate;

    public List<ExperienceProfessionelle> findAll() {
        // 执行查询集合中全部文档信息
        List<ExperienceProfessionelle> documentList =
                mongoTemplate.findAll(ExperienceProfessionelle.class, CollectionNames.EXPERIENCEPROFESSIONNELLE);
        // 输出结果
        for (ExperienceProfessionelle experienceProfessionelle : documentList) {
            log.info("用户信息：{}", experienceProfessionelle);
        }
        return documentList;
    }
}
