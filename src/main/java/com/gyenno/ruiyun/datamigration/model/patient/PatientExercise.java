package com.gyenno.ruiyun.datamigration.model.patient;

import lombok.Data;

import java.util.Date;

@Data
public class PatientExercise {
    private Integer id;

    private Integer ageStage;

    private String createBy;

    private Date createDate;

    private String createName;

    private String exeName;

    private Integer grade;

    private String updateBy;

    private Date updateDate;

    private String updateName;

    private Integer patientId;

    private Integer version;

    private String remarks;
}
