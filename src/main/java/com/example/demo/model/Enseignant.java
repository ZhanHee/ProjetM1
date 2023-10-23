package com.example.demo.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Data
@Document(value = "enseignant")
public class Enseignant {
    /**
     * clé primaire
     */
    private Integer id;
    /**
     *Nom
     */
    private String first_name;
    /**
     *Prénom
     */
    private String last_name;
    /**
     * date de naissance
     */
    private Date date_of_birth;
    /**
     *contact
     */
    private Contact contact;
    /**
     * adress
     */
    private Adresse adresse;
    /**
     * series of experience professionalise
     */
    private int experience_professionelle_id;
    /**
     * series of publications
     */
    private int publication_id;
    /**
     * series of awards
     */
    private int awards_id;
    /**
     * series of education activites
     */
    private int education_activites_id;
    /**
     * series of scentific activites
     */
    private int scentific_activites_id;
    /**
     * series of program of research
     */
    private int program_of_research_id;
    /**
     * series of educations
     */
    private int education_id;
}
