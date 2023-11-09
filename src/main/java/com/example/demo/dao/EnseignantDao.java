package com.example.demo.dao;

import com.example.demo.constant.CollectionNames;
import com.example.demo.model.Award;
import com.example.demo.model.Enseignant;
import com.example.demo.model.ExperienceProfessionelle;
import lombok.extern.slf4j.Slf4j;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
public class EnseignantDao {

    @Autowired
    private MongoTemplate mongoTemplate;


    public List<Enseignant> findAll() {
        // 执行查询集合中全部文档信息
        List<Enseignant> enseignantList = mongoTemplate.findAll(Enseignant.class, CollectionNames.ENSEIGNANT);


        // 打印输出结果
        for (Enseignant enseignant : enseignantList) {
            log.info("用户信息：{}", enseignant);
        }
        return documentList;
    }
    public Enseignant findEnseignantByFirstName(String first_name) {
        Query query=new Query(Criteria.where("FirstName").is(first_name));
        Enseignant enseignant =  mongoTemplate.findOne(query , Enseignant.class, CollectionNames.ENSEIGNANT);
        return enseignant;
    }

    public Enseignant findEnseignantByLastName(String last_name) {
        Query query=new Query(Criteria.where("LastName").is(last_name));
        Enseignant enseignant =  mongoTemplate.findOne(query , Enseignant.class,CollectionNames.ENSEIGNANT);
        return enseignant;
    }

    public Enseignant findEnseignantById(String id) {
        Query query=new Query(Criteria.where("_id").is(id));
        Enseignant enseignant =  mongoTemplate.findOne(query , Enseignant.class, CollectionNames.ENSEIGNANT);
        return enseignant;
    }

    public Award findAwardById(String id){
        Query query= new Query(Criteria.where("_id").is(id));
        Award award = mongoTemplate.findOne(query, Award.class, CollectionNames.AWARDS);
        return award;
    }

    public ExperienceProfessionelle findEPById(String id){
        Query query = new Query(Criteria.where("_id").is(id));
        ExperienceProfessionelle experienceProfessionelle = mongoTemplate.findOne(query,
                ExperienceProfessionelle.class,
                CollectionNames.EXPERIENCEPROFESSIONNELLE);
        return experienceProfessionelle;
    }

}
