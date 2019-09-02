package com.gyenno.ruiyun.datamigration.model.patient;

import lombok.Data;

import java.util.Date;

@Data
public class PatientComplication {
    private Integer id;

    private String createBy;

    private Date createDate;

    private String createName;

    private Integer illustration;

    private Integer majorComplicationType;

    private Integer minorComplicationType;

    private Date occurrenceTime;

    private Integer result;

    private Integer treatment;

    private String updateBy;

    private Date updateDate;

    private String updateName;

    private Integer patientSurgicalId;

    private String patientCaseId;

    private String process;

    private String remarks;
}
