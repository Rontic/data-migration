package com.gyenno.ruiyun.datamigration.model.patient;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class PatientVitalSign {
    private Integer id;

    private String createBy;

    private Date createDate;

    private String createName;

    private String updateBy;

    private Date updateDate;

    private String updateName;

    private String patientCaseId;

    private Integer patient;

    private Date checkTime;

    private String breathing;

    private String temperature;

    private String pulse;

    private Byte rhythm;

    private String remark;

    private List<PatientVitalSignDetail> patientVitalSignDetailList;
}
