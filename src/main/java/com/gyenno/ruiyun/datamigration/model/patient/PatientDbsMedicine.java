package com.gyenno.ruiyun.datamigration.model.patient;

import lombok.Data;

import java.util.Date;

@Data
public class PatientDbsMedicine {
    private Integer id;

    private String createBy;

    private Date createDate;

    private String createName;

    private String number;

    private Integer medicineId;

    private String medicalSpecUsed;

    private Double takeDose;

    private Double totalMeasure;

    private Double ledd;

    private String updateBy;

    private Date updateDate;

    private String updateName;

    private Integer patientDbsFirstId;

    private Integer patientDbsFollowId;
}
