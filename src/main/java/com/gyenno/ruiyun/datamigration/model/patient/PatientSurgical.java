package com.gyenno.ruiyun.datamigration.model.patient;

import lombok.Data;

import java.util.Date;

@Data
public class PatientSurgical {
    private Integer id;

    private Date arisetTime;

    private String createBy;

    private Date createDate;

    private String createName;

    private String updateBy;

    private Date updateDate;

    private String updateName;

    private Integer surgicalInfoId;

    private String patientCaseId;

    private Integer patientId;

    private Integer surgicalType;

    private String surgicalTime;
}
