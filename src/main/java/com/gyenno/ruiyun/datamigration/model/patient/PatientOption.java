package com.gyenno.ruiyun.datamigration.model.patient;

import lombok.Data;

import java.util.Date;

@Data
public class PatientOption {
    private Integer id;

    private String bpmStatus;

    private String createBy;

    private Date createDate;

    private String createName;

    private String sysCompanyCode;

    private String sysOrgCode;

    private String updateBy;

    private Date updateDate;

    private String updateName;

    private Integer patientId;

    private Integer patientScaleId;

    private String scaleOptionId;

    private Integer sort;

    private String remarks;

    private String optionPoint;
}
