package com.gyenno.ruiyun.datamigration.model.patient;

import lombok.Data;

import java.util.Date;

@Data
public class PatientDependents {
    private Integer id;

    private String createBy;

    private String createName;

    private Date createDate;

    private Integer patientId;

    private String dependentsName;

    private Date birthday;

    private String sex;

    private Integer degree;

    private Integer patientRelationship;

    private String isLive;

    private Integer visitsFrequency;

    private Integer telephoneFrequency;

    private String authenticity;

    private String updateBy;

    private String updateName;

    private Date updateDate;

    private String remarks;
}
