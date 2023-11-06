package com.example.demo.controller;

import com.example.demo.dao.PublicationDao;
import com.example.demo.model.Publication;
import com.example.demo.util.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@CrossOrigin
@RequestMapping("/publication")
public class PublicationController {

    @Autowired
    PublicationDao publicationDao;

    @GetMapping("/findAll")
    public Result<List<Publication>> findAll(){
        List<Publication> list= publicationDao.findAll();
        return Result.success(list);
    }

}
