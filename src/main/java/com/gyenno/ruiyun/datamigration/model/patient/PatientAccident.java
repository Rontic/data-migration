package com.gyenno.ruiyun.datamigration.model.patient;

import lombok.Data;

import java.util.Date;

@Data
public class PatientAccident {
    private Integer id;

    private Date ariseTime;

    private String createBy;

    private Date createDate;

    private String createName;

    private String updateBy;

    private Date updateDate;

    private String updateName;

    private Integer accidentInfo;

    private Integer patientId;

    private String remarks;
}
