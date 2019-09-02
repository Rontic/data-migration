package com.gyenno.ruiyun.datamigration.model.patient;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class PatientScale {
    private Integer id;

    private String createBy;

    private Date createDate;

    private String createName;

    private Date lastTakingTime;

    private Float scalePoint;

    private Integer switchType;

    private String updateBy;

    private Date updateDate;

    private String updateName;

    private String patientCaseId;

    private Integer patientId;

    private String scaleInfoId;

    private Date inspectTime;

    private Byte isComplete;

    private Integer equipmentSwitchgear;

    private Float partOneScore;

    private Float partTwoScore;

    private Float partThreeScore;

    private String scaleExtrainfo;

    private String remarks;

    private String scaleSympInfo;

    private String scaleOptionIds;

    private String scaleSympName;

    private String scaleSympTip;

    private String scaleextraInfotip;

    private List<PatientOption> patientOptionList;

    private List<PatientScaleFile> patientScaleFileList;
}
