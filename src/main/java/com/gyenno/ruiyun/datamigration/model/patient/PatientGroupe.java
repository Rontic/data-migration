package com.gyenno.ruiyun.datamigration.model.patient;

import lombok.Data;

import java.util.Date;

@Data
public class PatientGroupe {
    private String id;

    private String createBy;

    private Date createDate;

    private String createName;

    private String remarks;

    private String updateBy;

    private Date updateDate;

    private String updateName;

    private String tcGroupeId;

    private Integer tcPatientId;
}
