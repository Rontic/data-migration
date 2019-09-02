package com.gyenno.ruiyun.datamigration.model.patient;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class PatientSpephysical {
    private Integer id;

    private Date ariseTime;

    private String createBy;

    private Date createDate;

    private String createName;

    private String spephysicalResult;

    private String updateBy;

    private Date updateDate;

    private String updateName;

    private Integer spephysicalInfo;

    private String patientCaseId;

    private Integer patient;

    private Byte pullTest;

    private Byte sittingBloc;

    private Byte facialOil;

    private Byte skinScratch;

    private Byte erectReflex;

    private Byte verticalTilt;

    private String checkType;

    private String backData;

    private Byte forgetLang;

    private Byte forgetUse;

    private Byte forgetCognize;

    private String forgetLangType;

    private String forgetUseType;

    private Byte simpleFeel;

    private Byte depthFeel;

    private Byte graphFeel;

    private Byte entityFeel;

    private String simpleFeelRemark;

    private String depthFeelRemark;

    private String graphFeelRemark;

    private String entityFeelRemark;

    private String forgetCognizeType;

    private String remarks;

    private List<PatientFieldDetail> patientFieldDetailList;
}
