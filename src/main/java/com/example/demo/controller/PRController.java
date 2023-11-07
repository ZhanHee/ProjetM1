package com.example.demo.controller;

import com.example.demo.dao.EADao;
import com.example.demo.dao.PRDao;
import com.example.demo.model.EducationActivity;
import com.example.demo.model.ProgramResearh;
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
@RequestMapping("/programme")
public class PRController {

    @Autowired
    PRDao prDao;

    @GetMapping("/findAll")
    public Result<List<ProgramResearh>> findAll(){
        List<ProgramResearh> list= prDao.findAll();
        return Result.success(list);
    }

}
