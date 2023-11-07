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
    @Field("name of activities")
    private String name_activity;
    /**
     * Date of Activites
     */
    @JsonFormat( pattern = "dd-mm-yyyy", timezone = "GMT+2")
    @Field("Date of activities")
    private Date date_activity;
    /**
     * Description
     */
    @Field("Description")
    private String description;
    /**
     * Type of activites
     */
    @Field("Type of activities")
    private String type_activity;
    /**
     * Related person
     */
    @Field("related_person_ids")
    private int related_person_id;
}
