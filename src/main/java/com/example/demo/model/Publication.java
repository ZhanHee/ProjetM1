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
@Document(value = "publication")
public class Publication {
    /**
     * clé primaire
     */
    @MongoId
    private ObjectId id;
    /**
     * Editeur
     */
    private String editeur;
    /**
     * Auteur
     */
    private String auteur;
    /**
     * Evaluator
     */
    private String evaluator;
    /**
     * Type of publication
     */
    private String type_publication;
    /**
     * Title of publication
     */
    private String title_publication;

}
