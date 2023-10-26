package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.Date;

@Data
@ToString
@Accessors(chain = true)
@Document(value = "Enseignant")
public class Enseignant {
    /**
     * clé primaire
     */
    @MongoId
    private ObjectId id;
    /**
     *Nom
     */
    @Field("FirstName")
    private String first_name;
    /**
     *Prénom
     */
    @Field("LastName")
    private String last_name;
    /**
     * date de naissance
     */
    @JsonFormat(pattern= "dd-mm-yyyy",timezone = "GMT+2")
    @Field("DateOfBirth")
    private Date date_of_birth;
    /**
     *contact
     */
    @Field("contact")
    private Contact contact;
    /**
     * adress
     */
    @Field("adresse")
    private Adresse adresse;
    /**
     * series of experience professionalise
     */
    @Field("experience professionelle_ids")
    private ObjectId experience_professionelle_id;
    /**
     * series of publications
     */
    @Field("publication_ids")
    private ObjectId publication_id;
    /**
     * series of awards
     */
    @Field("awards_ids")
    private ObjectId awards_id;
    /**
     * series of education activites
     */
    @Field("education_activites_ids")
    private ObjectId education_activites_id;
    /**
     * series of scentific activites
     */
    @Field("scentific_activities_ids")
    private ObjectId scentific_activites_id;
    /**
     * series of program of research
     */
    @Field("programm_of_research_ids")
    private ObjectId program_of_research_id;
    /**
     * series of educations
     */
    @Field("education_ids")
    private ObjectId education_id;
}
