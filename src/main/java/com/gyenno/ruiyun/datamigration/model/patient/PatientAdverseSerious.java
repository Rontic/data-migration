package com.gyenno.ruiyun.datamigration.model.patient;

import lombok.Data;

import java.util.Date;

@Data
public class PatientAdverseSerious {
    private Integer id;

    private String adverseName;

    private String saeSituation;

    private Date saeAccurDate;

    private Date saeGetDate;

    private Byte outCome;

    private Byte treatmentRelate;

    private Byte sequela;

    private Date disappearTime;

    private String deathCause;

    private Date deathDate;

    private Byte domesticSituation;

    private Byte abroadSituation;

    private String relateEvaluateFlag;

    private Byte unblindFlag;

    private Date unblindDate;

    private String saeDealDetail;

    private String createBy;

    private Date createDate;

    private String updateBy;

    private Date updateDate;

    private String patientCaseId;

    private Integer patientId;
}
