package com.gyenno.ruiyun.datamigration.model.patient;

import lombok.Data;

import java.util.Date;

@Data
public class PatientMotUniAnaResu {
    private String id;

    private String amplitude;

    private String createBy;

    private Date createDate;

    private String createName;

    private String duration;

    private String examItemName;

    private String muscle;

    private String phases;

    private String spikeDuration;

    private String updateBy;

    private Date updateDate;

    private String updateName;

    private String motUniAnaItemId;

    private String pElecTroGramId;

    private String pCaseId;

    private Integer pInfoId;

    private String remarks;
}
