package com.gyenno.ruiyun.datamigration.model.patient;

import lombok.Data;

import java.util.Date;

@Data
public class PatientScaleFile {
    private String id;

    private String fileName;

    private String filePath;

    private Integer size;

    private Integer patientScaleId;

    private String createBy;

    private String createName;

    private Date createDate;

    private String updateBy;

    private String updateName;

    private Date updateDate;

    private Integer patientId;

    private String patientCaseId;
}
