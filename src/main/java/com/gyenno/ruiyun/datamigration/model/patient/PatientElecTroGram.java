package com.gyenno.ruiyun.datamigration.model.patient;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class PatientElecTroGram {
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

    //运动神经传导项检查结果
    private List<PatientMotNerCondResu> patientMotNerCondResuList;
    //F波研究项检查结果
    private List<PatientFWavStuResu> patientFWavStuResuList;
    //感觉神经传导检查结果
    private List<PatientSenNerCondResu> patientSenNerCondResuList;
    //针刺肌电图检查项结果
    private List<PatientNeedExamResu> patientNeedExamResuList;
    //运动单元分析项
    private List<PatientMotUniAnaResu> patientMotUniAnaResuList;
    //干扰项分析
    private List<PatientIntPatAnaItem> patientIntPatAnaItemList;
}
