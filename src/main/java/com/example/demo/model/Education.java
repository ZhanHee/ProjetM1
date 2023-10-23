package com.example.demo.model;

import com.example.demo.constant.Level;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(value = "education")
public class Education {
    /**
     * clé primaire
     */
    private int id;
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
