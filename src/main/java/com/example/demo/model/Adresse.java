package com.example.demo.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(value = "adresss")
public class Adresse {
    /**
     * Road
     */
    private String road;
    /**
     * City
     */
    private String city;
    /**
     * Country
     */
    private String country;
    /**
     * Poste code
     */
    private Long post_code;
}
