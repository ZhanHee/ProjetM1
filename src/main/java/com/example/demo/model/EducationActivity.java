package com.example.demo.model;

import com.example.demo.constant.Level;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document(value = "education_activites")
public class EducationActivity {
    /**
     * clé primaire
     */
    private int id;
    /**
     * Name of student
     */
    private String name_student;
    /**
     * Level of student
     */
    private Level level;
    /**
     * Date Debut
     */
    private Date date_debut;
    /**
     * Date Fin
     */
    private Date date_fin;
    /**
     * Recherché topic
     */
    private String recherche_topic;
    /**
     * Place of Education
     */
    private String place_education;
    /**
     * Description
     */
    private String description;
}
