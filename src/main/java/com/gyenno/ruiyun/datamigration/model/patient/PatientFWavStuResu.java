package com.gyenno.ruiyun.datamigration.model.patient;

import lombok.Data;

import java.util.Date;

@Data
public class PatientFWavStuResu {
    private String id;

    private String fLatency;

    private String fProportion;

    private String mLatency;

    private String createBy;

    private Date createDate;

    private String createName;

    private String nerve;

    private String remarks;

    private String updateBy;

    private Date updateDate;

    private String updateName;

    private String fWavStuItemId;

    private String pElecTroGramId;

    private String pCaseId;

    private Integer pInfoId;
}
