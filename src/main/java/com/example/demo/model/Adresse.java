package com.example.demo.model;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@ToString
@Accessors(chain = true)
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
