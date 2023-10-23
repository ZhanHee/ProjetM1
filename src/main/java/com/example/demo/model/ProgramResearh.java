package com.example.demo.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(value = "program_research")
public class ProgramResearh {
    /**
     * clé primaire
     */
    private int id;
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
