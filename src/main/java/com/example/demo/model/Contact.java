package com.example.demo.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(value = "contact")
public class Contact {

    /**
     * site_web
     */
    private String site_web;
    /**
     * e-mail
     */
    private String email;
    /**
     * telephone
     */
    private Long telephone;

}
