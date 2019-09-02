package com.gyenno.ruiyun.datamigration.model.patient;

import lombok.Data;

import java.util.Date;

@Data
public class PatientDbsParameter {
    private Integer id;

    private Integer paramType;

    private Integer schemeOrder;

    private Integer limbSide;

    private Integer exciteMod;

    private String negativePole;

    private String positivePole;

    private String frequency;

    private String pulseWidth;

    private String voltage;

    private Integer resistance;

    private Double electric;

    private Double electricity;

    private String effectInfo;

    private Integer patientDbsFirstId;

    private Integer patientDbsFollowId;

    private String createBy;

    private Date createDate;

    private String createName;

    private String updateBy;

    private Date updateDate;

    private String updateName;

    private String negativePole2;

    private String positivePole2;

    private String remarks;
}
