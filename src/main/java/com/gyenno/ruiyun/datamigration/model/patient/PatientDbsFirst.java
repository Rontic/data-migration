package com.gyenno.ruiyun.datamigration.model.patient;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class PatientDbsFirst {
    private Integer id;

    private String createBy;

    private Date createDate;

    private String createName;

    private String leftContactEffectOrder;

    private Integer leftExciteMod;

    private String leftFrequency;

    private String leftNegativePole;

    private String leftPositivePole;

    private String leftPulseWidth;

    private String leftVoltage;

    private String medicationStatus;

    private String patientCaseId;

    private Integer reliefDay;

    private String rightContactEffectOrder;

    private Integer rightExciteMod;

    private String rightFrequency;

    private String rightNegativePole;

    private String rightPositivePole;

    private String rightPulseWidth;

    private String rightVoltage;

    private String deviceId;

    private String updateBy;

    private Date updateDate;

    private String updateName;

    private Date programDate;

    private Integer patientSurgicalId;

    private Integer devicePowerType;

    private Integer isTakeMedication;

    private Integer damageEffectExist;

    private String damageEffectDuration;

    private Integer adverseEventsExist;

    private String adverseEventsRemark;

    private String remarks;

    private String departId;

    private String tcDeviceId;

    private List<PatientDbsFirstDetail> patientDbsFirstDetailList;

    private List<PatientDbsMedicine> patientDbsMedicineList;

    private List<PatientDbsParameter> patientDbsParameterList;

    private List<PatientDbsChoose> patientDbsChooseList;
}
