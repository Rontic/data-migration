package com.gyenno.ruiyun.datamigration.model.patient;

import lombok.Data;

import java.util.Date;

@Data
public class PatElecTroGram {
    private String id;

    private String createBy;

    private Date createDate;

    private String createName;

    private String etgName;

    private String etgType;

    private String updateBy;

    private Date updateDate;

    private String updateName;

    private String elecTroGramId;

    private String pCaseId;

    private Integer pInfoId;

    private String elecExamType;

    private Integer myotremorFrequency;

    private String etgString;

    private String remarks;

    private String patEleHint;

    private String patEleResule;
}
