package com.gyenno.ruiyun.datamigration.model.patient;

import lombok.Data;

import java.util.Date;

@Data
public class PatientExtra {
    private Integer id;

    private String createBy;

    private Date createDate;

    private String createName;

    private String extraName;

    private String extraVal;

    private String updateBy;

    private Date updateDate;

    private String updateName;

    private Integer patientId;

    private String remarks;
}
