package com.example.demo.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(value = "publication")
public class Publication {
    /**
     * clé primaire
     */
    private int id;
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
