package com.example.demo.controller;

import com.example.demo.dao.EPDao;
import com.example.demo.model.Award;
import com.example.demo.model.ExperienceProfessionelle;
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
@RequestMapping("/experience")
public class EPController {

    @Autowired
    EPDao epDao;

    @GetMapping("/findAll")
    public Result<List<ExperienceProfessionelle>> findAll(){
        List<ExperienceProfessionelle> list= epDao.findAll();
        return Result.success(list);
    }

}
