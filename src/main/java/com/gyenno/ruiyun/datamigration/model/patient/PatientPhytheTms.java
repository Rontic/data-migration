package com.gyenno.ruiyun.datamigration.model.patient;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
public class PatientPhytheTms {
    private Integer id;

    private Date recordDate;

    private Byte deviceType;

    private BigDecimal stimulusIntensity;

    private BigDecimal stimulusFrequency;

    private String stimulusSide;

    private BigDecimal stimulusDuration;

    private String leftThresholdBefore;

    private String rightThresholdBefore;

    private String leftThresholdAfter;

    private String rightThresholdAfter;

    private Integer physiType;

    private Byte reactionFlag;

    private String remark;

    private String patientCaseId;

    private Integer patientId;

    private String createBy;

    private Date createDate;

    private String createName;

    private String updateBy;

    private Date updateDate;

    private String updateName;

    private List<PatientPhytheReaction> patientPhytheReactionList;
}
