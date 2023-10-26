package com.example.demo.controller;

import com.example.demo.dao.EnseignantDao;
import com.example.demo.model.Enseignant;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * Méthodes pratiques
 *
 * @author zzh
 */
@Slf4j
@RestController
@RequestMapping("/enseignant")
public class EnseignantController {

    @Autowired
    private EnseignantDao endao;


    @GetMapping("/findAll")
    public List<Enseignant> findAll(){
        List<Enseignant> list= endao.findAll();
        System.out.println("输出");
        return list;
    }

    @GetMapping("/firstname/{first_name}")
    public Enseignant findEnseignantByFirstName(@PathVariable String first_name){
        Enseignant enseignant= endao.findEnseignantByFirstName(first_name);
        System.out.println("enseignant is "+enseignant);
        return enseignant;
    }

    @GetMapping("/lastname/{last_name}")
    public Enseignant findEnseignantByLastName(@PathVariable String last_name){
        Enseignant enseignant= endao.findEnseignantByLastName(last_name);
        System.out.println("enseignant is "+enseignant);
        log.info("用户信息：{}", enseignant);
        return enseignant;
    }

    @GetMapping("/id/{_id}")
    public Enseignant findEnseignantById(@PathVariable String id){
        Enseignant enseignant= endao.findEnseignantById(id);
        System.out.println("enseignant is "+enseignant);
        return enseignant;
    }


}
