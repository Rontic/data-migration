package com.gyenno.ruiyun.datamigration.model.patient;

import lombok.Data;

import java.util.Date;

@Data
public class PatientDbsFirstDetail {
    private Integer id;

    private String changeConstantly;

    private String contact;

    private String createBy;

    private Date createDate;

    private String createName;

    private String dbsCase;

    private Double elbowTone;

    private Double kneeTone;

    private Double neckTone;

    private String sideEffect;

    private Integer tcPatientDbsFirstId;

    private Double tremor;

    private String updateBy;

    private Date updateDate;

    private String updateName;

    private Double wristTone;

    private Integer dbsVoltage;

    private Integer sideEffectDuration;

    private Integer patientDbsFirstId;

    private Double tensionTone;
}
