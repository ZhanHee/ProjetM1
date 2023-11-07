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
@Document(value = "award")
public class Award {
    /**
     * clé primaire
     */
    @MongoId
    private ObjectId id;
    /**
     * Date
     */
    @JsonFormat( pattern ="dd-mm-yyyy", timezone ="GMT+2")
    @Field("Date")
    private Date date;
    /**
     * Name of awards
     */
    @Field("Name of awards")
    private String name_award;
    /**
     * Description
     */
    @Field("Description of awards")
    private String description;
}
