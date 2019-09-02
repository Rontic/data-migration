package com.gyenno.ruiyun.datamigration.model.patient;

import lombok.Data;

import java.util.Date;

@Data
public class PatientTreatment {
    private Integer id;

    private String createBy;

    private Date createDate;

    private String createName;

    private Date surgicalDate;

    private Integer surgicalInfoId;

    private String updateBy;

    private Date updateDate;

    private String updateName;

    private Integer patientSurgicalId;

    private String patientCaseId;

    private String remarks;
}
