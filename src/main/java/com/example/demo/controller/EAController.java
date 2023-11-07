package com.example.demo.controller;

import com.example.demo.dao.EADao;
import com.example.demo.dao.EducationDao;
import com.example.demo.model.Education;
import com.example.demo.model.EducationActivity;
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
@RequestMapping("/eActivity")
public class EAController {

    @Autowired
    EADao eaDao;

    @GetMapping("/findAll")
    public Result<List<EducationActivity>> findAll(){
        List<EducationActivity> list= eaDao.findAll();
        return Result.success(list);
    }

}
