package com.example.demo.model;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Data
@ToString
@Accessors(chain = true)
@Document(value = "program_research")
public class ProgramResearh {
    /**
     * clé primaire
     */
    @MongoId
    private ObjectId id;
    /**
     * Name of Program
     */
    private String name;
    /**
     * Sponsor
     */
    private String sponsor;
    /**
     * Budget
     */
    private int budget;
    /**
     * period (calculate by day)
     */
    private int period;
    /**
     * Implication
     */
    private String implication;
}
