package com.example.demo.model;


import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document(value = "award")
public class Award {
    /**
     * clé primaire
     */
    private int id;
    /**
     * Date
     */
    private Date date;
    /**
     * Name of awards
     */
    private String name_award;
    /**
     * Description
     */
    private String description;
}
