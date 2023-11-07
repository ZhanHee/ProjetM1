package com.example.demo.model;

import com.example.demo.constant.Level;
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
@Document(value = "education")
public class Education {
    /**
     * clé primaire
     */
    @MongoId
    private ObjectId id;
    /**
     * Level of education
     */
    @Field("level of education")
    private Level level;
    /**
     * Place of Education
     */
    @Field("palce of education")
    private String Education;
    /**
     * Name of Major Studied
     */
    @Field("name of major studied")
    private String major;
    /**
     * Period (calculate by month)
     */
    @Field("Period")
    private int period;
}
