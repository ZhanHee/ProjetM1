package com.example.demo.controller;

import com.example.demo.dao.GeneratePDFDao;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;


@RestController
@RequestMapping("/Ganerate")
public class GeneratePDF {

    @Autowired
    private GeneratePDFDao generatePDFDao;

    @GetMapping("/pdf/download")
    public void download(HttpServletResponse response) {
        try {

            response.reset();
            response.setContentType("application/pdf");
            response.setHeader("Content-disposition",
                    "attachment;filename=user_pdf_" + System.currentTimeMillis() + ".pdf");

            OutputStream os = response.getOutputStream();
            generatePDFDao.generateItextPdfDocument(os);
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }




}
