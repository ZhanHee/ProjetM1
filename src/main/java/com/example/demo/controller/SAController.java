package com.example.demo.controller;

import com.example.demo.dao.SADao;
import com.example.demo.model.ScentificActivity;
import com.example.demo.util.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@CrossOrigin
@RequestMapping("/science")
public class SAController {

    @Autowired
    SADao saDao;

    @GetMapping("/findAll")
    public Result<List<ScentificActivity>> findAll(){
        List<ScentificActivity> list= saDao.findAll();
        return Result.success(list);
    }

}
