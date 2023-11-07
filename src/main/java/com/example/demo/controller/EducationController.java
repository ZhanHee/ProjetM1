package com.example.demo.controller;

import com.example.demo.dao.AwardDao;
import com.example.demo.dao.EducationDao;
import com.example.demo.model.Award;
import com.example.demo.model.Education;
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
@RequestMapping("/education")
public class EducationController {

    @Autowired
    EducationDao educationDao;

    @GetMapping("/findAll")
    public Result<List<Education>> findAll(){
        List<Education> list= educationDao.findAll();
        return Result.success(list);
    }

}
