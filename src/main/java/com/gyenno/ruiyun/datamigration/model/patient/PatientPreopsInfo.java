package com.gyenno.ruiyun.datamigration.model.patient;

import lombok.Data;
import java.util.Date;
import java.util.List;

@Data
public class PatientPreopsInfo {
    private Integer id;

    private Double closeRatio;

    private Double closeTime;

    private String createBy;

    private Date createDate;

    private String createName;

    private Double depDyskinesiaOpenRatio;

    private Integer devicePowerType;

    private Double dyskinesiaTime;

    private Date intensionAriseTime;

    private Double loadingDoseCount;

    private Double norDyskinesiaOpenRatio;

    private Double openRatio;

    private Double openTime;

    private Integer operationIntension;

    private Double udysbsOneRatio;

    private String updateBy;

    private Date updateDate;

    private String updateName;

    private Double updrsFouroneRatio;

    private Double updrsFourthreeRatio;

    private Double wakeTime;

    private String deviceId;

    private Integer patientSurgicalId;

    private Date preopsTime;

    private Date terminalTime;

    private Integer terminalScale;

    private Integer terminalExist;

    private Integer terminalIsfirst;

    private Date terminalFirstTime;

    private Double terminalDuration;

    private Date motorTestTime;

    private String preopsRemark;

    private String terminalRemark;

    private String diaryRemark;

    private String dyskinesiaRemark;

    private String nonmotorRemark;

    private String motorRemark;

    private String intensionRemark;

    private String patientCaseId;

    private Integer type;

    private String file;

    private List<PatientPreopsDiary> patientPreopsDiaryList;

    private List<PatientPreopsMedicine> patientPreopsMedicineList;

    private List<PatientPreopsScale> patientPreopsScaleList;
}
