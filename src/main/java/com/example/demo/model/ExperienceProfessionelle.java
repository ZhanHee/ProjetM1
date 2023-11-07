package com.example.demo.model;

import cn.hutool.core.util.ObjectUtil;
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
@Document(value = "experience_professionelle")
public class ExperienceProfessionelle {
    /**
     * clé primaire
     */
    @MongoId
    private ObjectId id;
    /**
     * postion name
     */
    @Field("postion name")
    private String PostionName;
    /**
     * Date Debut
     */
    @JsonFormat( pattern = "dd-mm-yyyy", timezone = "GMT+2")
    @Field("Date debut")
    private Date DateDebut;
    /**
     * Date Fin
     */
    @JsonFormat( pattern = "dd-mm-yyyy", timezone = "GMT+2")
    @Field("Date fin")
    private Date DateFin;
    /**
     * Work place
     */
    @Field("Workplace")
    private String WorkPlace;
    /**
     * Description
     */
    @Field("Description")
    private String Description;

}
