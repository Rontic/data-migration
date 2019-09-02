package com.gyenno.ruiyun.datamigration.model.patient;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class PatientDbsFollow {
    private Integer id;

    private Float lStnElectric;

    private Integer lStnResistance;

    private Float rStnElectric;

    private Integer rStnResistance;

    private Integer adjustMoreLeftSatisfaction;

    private Integer adjustMoreRightSatisfaction;

    private Integer adjustVoltageLeftSatisfaction;

    private Integer adjustVoltageRightSatisfaction;

    private String complaint;

    private String createBy;

    private Date createDate;

    private String createName;

    private Integer followNum;

    private Integer leftExciteMod;

    private String leftFrequency;

    private String leftNegativePole;

    private String leftPositivePole;

    private String leftPulseWidth;

    private String leftVoltage;

    private String medicationStatus;

    private Integer patientDbsFirstId;

    private Date programDate;

    private Integer rightExciteMod;

    private String rightFrequency;

    private String rightNegativePole;

    private String rightPositivePole;

    private String rightPulseWidth;

    private String rightVoltage;

    private Float stnVoltage;

    private String deviceId;

    private String updateBy;

    private Date updateDate;

    private String updateName;

    private Integer patientSurgicalId;

    private String patientCaseId;

    private Integer devicePowerType;

    private String effectInfo;

    private Integer isTakeMedication;

    private Integer adjustBeforeLeftSatisfaction;

    private Integer adjustBeforeRightSatisfaction;

    private String remarks;

    private String departId;

    private String tcDeviceId;

    private List<PatientDbsMedicine> patientDbsMedicineList;

    private List<PatientDbsParameter> patientDbsParameterList;

    private List<PatientDbsChoose> patientDbsChooseList;
}
