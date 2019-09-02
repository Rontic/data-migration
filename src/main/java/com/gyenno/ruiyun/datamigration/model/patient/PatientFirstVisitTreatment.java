package com.gyenno.ruiyun.datamigration.model.patient;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class PatientFirstVisitTreatment {
    private Integer id;

    private Integer firstVisitType;

    private Integer treatmentType;

    private Integer treatmentMethod;

    private Date treatmentTime;

    private Integer medicineClassification;

    private Integer medicineName;

    private Integer commonMedicineName;

    private BigDecimal dailyDosage;

    private Date firstTime;

    private Integer patientId;

    private String createBy;

    private Date createDate;

    private String updateBy;

    private Date updateDate;

    private BigDecimal ledd;

    private String yearsOfMedicine;

    private Integer whetherEffect;

    private Integer adverse;

    private Integer whetherContinue;

    private Date stopTime;

    private String medicalSpecUsed;

    private BigDecimal dailyDosagePian;

    private Integer isTakingTcm;

    private String remarks;

    private String stopReason;
}
