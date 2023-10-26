package com.example.demo.model;

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
@Document(value = "scentific_activity")
public class ScentificActivity {
    /**
     * clé primaire
     */
    @MongoId
    private ObjectId id;
    /**
     * Name of Activites
     */
    private String name_activity;
    /**
     * Date of Activites
     */
    @JsonFormat( pattern = "dd-mm-yyyy", timezone = "GMT+2")
    private Date date_activity;
    /**
     * Description
     */
    private String description;
    /**
     * Type of activites
     */
    private String type_activity;
    /**
     * Related person
     */
    private int related_person_id;
}
