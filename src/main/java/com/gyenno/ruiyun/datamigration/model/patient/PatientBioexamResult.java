package com.gyenno.ruiyun.datamigration.model.patient;

import lombok.Data;

import java.util.Date;

@Data
public class PatientBioexamResult {
    private Integer id;

    private String createBy;

    private Date createDate;

    private String createName;

    private String updateBy;

    private Date updateDate;

    private String updateName;

    private Integer bioexamProjectId;

    private Integer patientBioexamId;

    private String patientCaseId;

    private Integer patientId;

    private Boolean isReference;

    private String remarks;

    private String result;
}
