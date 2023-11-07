package com.example.demo.controller;

import com.example.demo.dao.AwardDao;
import com.example.demo.dao.PublicationDao;
import com.example.demo.model.Award;
import com.example.demo.model.Publication;
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
@RequestMapping("/award")
public class AwardController {

    @Autowired
    AwardDao awardDao;

    @GetMapping("/findAll")
    public Result<List<Award>> findAll(){
        List<Award> list= awardDao.findAll();
        return Result.success(list);
    }

}
