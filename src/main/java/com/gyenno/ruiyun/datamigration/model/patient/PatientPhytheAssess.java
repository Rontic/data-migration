package com.gyenno.ruiyun.datamigration.model.patient;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class PatientPhytheAssess {
    private Integer id;

    private Date recordDate;

    private Integer situationType;

    private String leftThreshold;

    private String rightThreshold;

    private String situationRemark;

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
