package com.gyenno.ruiyun.datamigration.model.patient;

import lombok.Data;

import java.util.Date;

@Data
public class PatientSenNerCondInfo {
    private String id;

    private String createBy;

    private Date createDate;

    private String createName;

    private String updateBy;

    private Date updateDate;

    private String updateName;

    private String pCaseId;

    private Integer pInfoId;

    private String senNerCondInfoId;

    private String remarks;
}
