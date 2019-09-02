package com.gyenno.ruiyun.datamigration.model.patient;

import lombok.Data;

import java.util.Date;

@Data
public class PatientCideexposedHistory {
    private Integer id;

    private String createBy;

    private Date createDate;

    private String createName;

    private String expmaterialName;

    private String exposedFrquency;

    private Integer exposedType;

    private Integer isDiscomfort;

    private Integer lifeStage;

    private String protMeasures;

    private String updateBy;

    private Date updateDate;

    private String updateName;

    private Integer patientId;

    private Integer version;

    private String workExperience;

    private String remarks;
}
