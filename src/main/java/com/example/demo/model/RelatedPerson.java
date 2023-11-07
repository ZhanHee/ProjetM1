package com.example.demo.model;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Data
@ToString
@Accessors(chain = true)
@Document(value = "award")
public class RelatedPerson {
    /**
     * clé primaire
     */
    @MongoId
    private ObjectId id;
    /**
     * Name of Related People
     */
    private String name;
    /**
     * Description
     */
    private String description;
}
