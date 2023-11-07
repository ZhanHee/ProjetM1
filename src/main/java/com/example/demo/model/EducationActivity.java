package com.example.demo.model;

import com.example.demo.constant.Level;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.Date;

@Data
@ToString
@Accessors(chain = true)
@Document(value = "education_activites")
public class EducationActivity {
    /**
     * clé primaire
     */
    @MongoId
    private ObjectId id;
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
    @JsonFormat( pattern ="dd-mm-yyyy", timezone ="GMT+2")
    private Date date_debut;
    /**
     * Date Fin
     */
    @JsonFormat( pattern ="dd-mm-yyyy", timezone ="GMT+2")
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
