package com.gyenno.ruiyun.datamigration.model.patient;

import lombok.Data;

import java.util.Date;

@Data
public class PatientBodypart {
    private Integer id;

    private Date ariseTime;

    private String createBy;

    private Date createDate;

    private String createName;

    private String spephysicalResult;

    private String updateBy;

    private Date updateDate;

    private String updateName;

    private String patientCaseId;

    private Integer patient;

    private String checkNumber;

    private String checkResult;

    private String remarks;

    private String files;

    private String partExamination;
}
