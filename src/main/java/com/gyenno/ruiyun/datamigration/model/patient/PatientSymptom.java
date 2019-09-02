package com.gyenno.ruiyun.datamigration.model.patient;

import lombok.Data;

import java.util.Date;

@Data
public class PatientSymptom {
    private Integer id;

    private Date ariseTime;

    private String createBy;

    private Date createDate;

    private String createName;

    private String remarks;

    private String symName;

    private String symType;

    private String updateBy;

    private Date updateDate;

    private String updateName;

    private String whetherLaw;

    private String patientCaseId;

    private Integer patientId;

    private Integer symptomTypeId;

    private Date ariseTimeLeftUp;

    private Date ariseTimeRightUp;

    private Date ariseTimeLeftDown;

    private Date ariseTimeRightDown;

    private String lastTime;

    private String notSportType;

    private Integer notSportTypeId;

    private Integer symTypeId;

    private Integer whetherLawId;
}
