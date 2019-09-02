package com.gyenno.ruiyun.datamigration.model.patient;

import lombok.Data;

import java.util.Date;

@Data
public class PatientVitalSignDetail {
    private Integer id;

    private String createBy;

    private Date createDate;

    private String createName;

    private String updateBy;

    private Date updateDate;

    private String updateName;

    private Byte bp;

    private Byte side;

    private String systolic;

    private String diastolic;

    private String heartrate;

    private Byte dizzy;

    private Integer patientVitalsignId;

    private String patientCaseId;
}
