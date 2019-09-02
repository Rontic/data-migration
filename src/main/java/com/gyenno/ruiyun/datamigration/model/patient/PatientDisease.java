package com.gyenno.ruiyun.datamigration.model.patient;

import lombok.Data;

import java.util.Date;

@Data
public class PatientDisease {
    private Integer id;

    private String createBy;

    private Date createDate;

    private String createName;

    private Date endTime;

    private String isHospitalization;

    private String medication;

    private String severity;

    private String surgeryHistory;

    private Date time;

    private String updateBy;

    private Date updateDate;

    private String updateName;

    private Integer diseaseRelationId;

    private Integer patientId;

    private Integer version;

    private Integer exist;

    private String tcmType;

    private String diseaseType;

    private String remarks;
}
