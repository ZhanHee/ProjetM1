package com.example.demo.controller;

import cn.hutool.json.JSONUtil;
import com.example.demo.dao.EnseignantDao;
import com.example.demo.model.Enseignant;
import com.example.demo.util.AjaxResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



/**
 * Méthodes pratiques
 *
 * @author zzh
 */
@Slf4j
@RestController
public class EnseignantController {

    @Autowired
    private EnseignantDao endao;

    @Autowired
    private MongoTemplate mongoTemplate;

    /**
     * Ajouter un nouveau professeur
     */
    @PostMapping(value = "/addEnseignant")
    public AjaxResult addEnseignant(@RequestBody Enseignant enseignant) {
        EnseignantDao.save(enseignant);
        log.info("【Enseignant】= {}", JSONUtil.toJsonStr(enseignant));
        return AjaxResult.success(enseignant);
    }

}
