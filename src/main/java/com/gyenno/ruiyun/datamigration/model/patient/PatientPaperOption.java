package com.gyenno.ruiyun.datamigration.model.patient;

import lombok.Data;

import java.util.Date;

@Data
public class PatientPaperOption {
    private Integer id;

    private String createBy;

    private String createName;

    private Date createDate;

    private Integer patientId;

    private Integer paperId;

    private Integer paperQuestionId;

    private Integer paperOptionId;

    private String updateBy;

    private String updateName;

    private Date updateDate;

    private Boolean isdelete;

    private String patientCaseId;

    private String optionPoint;

    private String remarks;
}
