package com.example.demo.model;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@ToString
@Accessors(chain = true)
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
