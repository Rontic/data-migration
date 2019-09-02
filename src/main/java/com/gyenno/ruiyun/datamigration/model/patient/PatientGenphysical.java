package com.gyenno.ruiyun.datamigration.model.patient;

import lombok.Data;

import java.util.Date;

@Data
public class PatientGenphysical {
    private Integer id;

    private Date ariseTime;

    private String createBy;

    private Date createDate;

    private String createName;

    private String genphysicalResult;

    private String updateBy;

    private Date updateDate;

    private String updateName;

    private Integer genphysicalInfo;

    private String patientCaseId;

    private Integer patientId;

    private String remarks;
}
