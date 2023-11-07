package com.example.demo.dao;

import com.example.demo.constant.CollectionNames;
import com.example.demo.model.EducationActivity;
import com.example.demo.model.ProgramResearh;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
public class PRDao {

    @Autowired
    private MongoTemplate mongoTemplate;

    public List<ProgramResearh> findAll() {
        // 执行查询集合中全部文档信息
        List<ProgramResearh> documentList =
                mongoTemplate.findAll(ProgramResearh.class, CollectionNames.PROGRAMRESEARCH);
        // 输出结果
        for (ProgramResearh programResearh : documentList) {
            log.info("用户信息：{}", programResearh);
        }
        return documentList;
    }
}
