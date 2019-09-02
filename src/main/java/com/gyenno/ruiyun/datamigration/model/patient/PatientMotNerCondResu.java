package com.gyenno.ruiyun.datamigration.model.patient;

import lombok.Data;

import java.util.Date;

@Data
public class PatientMotNerCondResu {
    private String id;

    private String amplitude;

    private String conductionVelocity;

    private String createBy;

    private Date createDate;

    private String createName;

    private String distance;

    private String latency;

    private String latencyDifference;

    private String nerveAndSite;

    private String nerveType;

    private String segment;

    private String updateBy;

    private Date updateDate;

    private String updateName;

    private String motNerItemId;

    private String pElecTroGramId;

    private String pCaseId;

    private Integer pInfoId;
}
