package com.gyenno.ruiyun.datamigration.model.patient;

import lombok.Data;

import java.util.Date;

@Data
public class PatientIntPatAnaItem {
    private String id;

    private String amplitude;

    private String createBy;

    private Date createDate;

    private String createName;

    private String muscle;

    private String ratio;

    private String turn;

    private String updateBy;

    private Date updateDate;

    private String updateName;

    private String intPatAnaId;

    private String pElecTroGramId;

    private String pCaseId;

    private Integer pInfoId;
}
