package com.gyenno.ruiyun.datamigration.model.patient;

import lombok.Data;

import java.util.Date;

@Data
public class PatientDiseaseOrder {
    private Integer id;

    private Integer arisePart;

    private Date time;

    private Integer patientId;

    private String createBy;

    private Date createDate;

    private String updateBy;

    private Date updateDate;
}
