package com.gyenno.ruiyun.datamigration.model.patient;

import lombok.Data;

import java.util.Date;

@Data
public class PatientMedhistory {
    private String id;

    private String createBy;

    private Date createDate;

    private String createName;

    private String medDose;

    private Date medEnd;

    private String medName;

    private Date medStart;

    private Integer medType;

    private String updateBy;

    private Date updateDate;

    private String updateName;

    private Integer patientId;

    private Integer version;

    private String isAdverse;

    private String isContinue;

    private String isEffective;

    private String startUnit;

    private String stopCause;

    private String medCommonName;

    private String doseEachTime;

    private Integer medDetailType;

    private Integer useYear;

    private String remarks;
}
