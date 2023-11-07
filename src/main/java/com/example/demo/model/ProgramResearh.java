package com.example.demo.model;

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
    @Field("name of programm")
    private String name;
    /**
     * Sponsor
     */
    @Field("Sponsor")
    private String sponsor;
    /**
     * Budget
     */
    @Field("Budget")
    private int budget;
    /**
     * period (calculate by day)
     */
    @Field("period")
    private int period;
    /**
     * Implication
     */
    @Field("implication")
    private String implication;
}
