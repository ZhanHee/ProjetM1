package com.example.demo.controller;

import com.example.demo.dao.EnseignantDao;
import com.example.demo.model.Enseignant;
import com.example.demo.util.Result;
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
@CrossOrigin
@RequestMapping("/enseignant")
public class EnseignantController {

    @Autowired
    private EnseignantDao endao;


    @GetMapping("/findAll")
    public Result<List<Enseignant>> findAll(){
        List<Enseignant> list= endao.findAll();
        System.out.println("输出");
        return Result.success(list);
    }

    @GetMapping("/firstname/{first_name}")
    public Result<Enseignant> findEnseignantByFirstName(@PathVariable String first_name){
        Enseignant enseignant= endao.findEnseignantByFirstName(first_name);
        System.out.println("enseignant is "+enseignant);
        return Result.success(enseignant);
    }

    @GetMapping("/lastname/{last_name}")
    public Result<Enseignant> findEnseignantByLastName(@PathVariable String last_name){
        Enseignant enseignant= endao.findEnseignantByLastName(last_name);
        System.out.println("enseignant is "+enseignant);
        log.info("用户信息：{}", enseignant);
        return Result.success(enseignant);
    }

    @GetMapping("/id/{_id}")
    public Result<Enseignant> findEnseignantById(@PathVariable String id){
        Enseignant enseignant= endao.findEnseignantById(id);
        System.out.println("enseignant is "+enseignant);
        return Result.success(enseignant);
    }


}
