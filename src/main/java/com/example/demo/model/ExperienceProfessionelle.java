package com.example.demo.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document(value = "experience_professionelle")
public class ExperienceProfessionelle {
    /**
     * clé primaire
     */
    private Integer id;
    /**
     * postion name
     */
    private String PostionName;
    /**
     * Date Debut
     */
    private Date DateDebut;
    /**
     * Date Fin
     */
    private Date DateFin;
    /**
     * Work place
     */
    private String WorkPlace;
    /**
     * Description
     */
    private String Description;

}
