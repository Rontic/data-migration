package com.gyenno.ruiyun.datamigration.model.patient;

import lombok.Data;

import java.util.Date;

@Data
public class PatientDependentAccompanying {
    private Integer id;

    private String createBy;

    private String createName;

    private Date createDate;

    private String patientCaseId;

    private Integer patientDependentsId;

    private String updateBy;

    private String updateName;

    private Date updateDate;

    private String remarks;
}
