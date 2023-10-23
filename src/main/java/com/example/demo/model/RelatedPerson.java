package com.example.demo.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(value = "award")
public class RelatedPerson {
    /**
     * clé primaire
     */
    private int id;
    /**
     * Name of Related People
     */
    private String name;
    /**
     * Description
     */
    private String description;
}
