package com.gyenno.ruiyun.datamigration.model.patient;

import lombok.Data;

import java.util.Date;

@Data
public class PatientFamilyHistory {
    private Integer id;

    private Date birthday;

    private String createBy;

    private Date createDate;

    private String createName;

    private String diseaseName;

    private Integer diseaseType;

    private Integer similarRole;

    private String updateBy;

    private Date updateDate;

    private String updateName;

    private Integer patientId;

    private Integer version;

    private Integer isGenMutationInfo;

    private Integer fetusType;

    private Date illnessTime;

    private Integer whetherAlive;

    private Integer deathAge;

    private String remarks;
}
