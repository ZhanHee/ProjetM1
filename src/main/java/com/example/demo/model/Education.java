package com.example.demo.model;

import com.example.demo.constant.Level;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
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
    private Level level;
    /**
     * Place of Education
     */
    private String Education;
    /**
     * Name of Major Studied
     */
    private String major;
    /**
     * Period (calculate by month)
     */
    private int period;
}
