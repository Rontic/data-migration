package com.gyenno.ruiyun.datamigration.model.patient;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class PatientMedicine {
    private Integer id;

    private Date ariseTime;

    private Float calculQuantity;

    private Integer computUnit;

    private String createBy;

    private Date createDate;

    private String createName;

    private Date drugstopTime;

    private Float oralQuantity;

    private Integer oralUnit;

    private Float stopDuration;

    private Float totalMeasure;

    private String unitFactor;

    private String updateBy;

    private Date updateDate;

    private String updateName;

    private Integer usages;

    private Integer medicineId;

    private String patientCaseId;

    private Integer patientId;

    private Integer days;

    private Float eveuseingmedicine;

    private Float moruseingmedicine;

    private Float nonuseingmedicine;

    private Float levodopaDose;

    private String levodopaFactorUsed;

    private String medicalSpecUsed;

    private Date stopDate;

    private Integer stopReason;

    private String stopRemark;

    private Date sideeffectDate;

    private Integer sideeffectType;

    private String sideeffectRemark;

    private Integer statusFlag;

    private Integer stopFlag;

    private Byte validFlag;

    private Byte firMedFlag;

    private Byte wearOffFlag;

    private Byte switchExistFlag;

    private Integer dyskinesia;

    private Byte dystoniaFlag;

    private String prescriptionDays;

    private String nonTakingDose;

    private String drugComplianceIndex;

    private Integer isTakingTcm;

    private String remarks;

    private List<PatientMedicineDetail> patientMedicineDetailList;
}
