package com.example.demo.model;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
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
    @Field("editeur")
    private String editeur;
    /**
     * Auteur
     */
    @Field("auteur")
    private String auteur;
    /**
     * Evaluator
     */
    @Field("Evaluators")
    private String evaluator;
    /**
     * Type of publication
     */
    @Field("Type of publication")
    private String type_publication;
    /**
     * Title of publication
     */
    @Field("Title of publication")
    private String title_publication;

}
