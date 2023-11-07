package com.example.demo.model;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@ToString
@Accessors(chain = true)
public class Adresse {
    /**
     * Road
     */
    @Field("Road")
    private String road;
    /**
     * City
     */
    @Field("City")
    private String city;
    /**
     * Country
     */
    @Field("Country")
    private String country;
    /**
     * Poste code
     */
    @Field("poste code")
    private Long post_code;
}
