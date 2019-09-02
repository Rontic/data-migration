package com.gyenno.ruiyun.datamigration.model.patient;

import lombok.Data;

import java.util.Date;

@Data
public class PatientPreopsMedicine {
    private Integer id;

    private String createBy;

    private Date createDate;

    private String createName;

    private Double loadingDose;

    private Integer medSpecification;

    private Double medUsage;

    private Integer medicineInfo;

    private Double morningDose;

    private String updateBy;

    private Date updateDate;

    private String updateName;

    private Integer patientPreopsInfoId;
}
