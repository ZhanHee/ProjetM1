package com.example.demo.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document(value = "scentific_activity")
public class ScentificActivity {
    /**
     * clé primaire
     */
    private int id;
    /**
     * Name of Activites
     */
    private String name_activity;
    /**
     * Date of Activites
     */
    private Date date_activity;
    /**
     * Description
     */
    private String description;
    /**
     * Type of activites
     */
    private String type_activity;
    /**
     * Related person
     */
    private int related_person_id;
}
