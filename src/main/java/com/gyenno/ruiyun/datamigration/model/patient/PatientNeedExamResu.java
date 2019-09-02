package com.gyenno.ruiyun.datamigration.model.patient;

import lombok.Data;

import java.util.Date;

@Data
public class PatientNeedExamResu {
    private String id;

    private String createBy;

    private Date createDate;

    private String createName;

    private String insertional;

    private String muscle;

    private String spoActFasc;

    private String spoActFib;

    private String spoActWave;

    private String updateBy;

    private Date updateDate;

    private String updateName;

    private String volmuapamp;

    private String volMuapdur;

    private String volmuappoly;

    private String needExamItemId;

    private String pElecTroGramId;

    private String pCaseId;

    private Integer pInfoId;
}
