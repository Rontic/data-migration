package com.gyenno.ruiyun.datamigration.model.patient;

import lombok.Data;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
public class PatientCombineMedicine {
    private Integer id;

    private String medicineName;

    private Integer medicineType;

    private String medicalSpecUsed;

    private Integer drugMethod;

    private Date firMedDate;

    private String drugOfYear;

    private Byte validFlag;

    private Boolean adrFlag;

    private Integer usages;

    private Integer isTaking;

    private Boolean computUnit;

    private BigDecimal dailyTakeDose;

    private String createBy;

    private Date createDate;

    private String createName;

    private String updateBy;

    private Date updateDate;

    private String updateName;

    private String patientCaseId;

    private Integer patientId;

    private Date stopDate;

    private Integer stopReason;

    private String stopRemark;

    private Date sideeffectDate;

    private Integer sideeffectType;

    private String sideeffectRemark;

    private Boolean statusFlag;

    private Boolean stopFlag;

    private Byte wearOffFlag;

    private Byte switchExistFlag;

    private Byte dyskinesia;

    private Byte dystoniaFlag;

    private String remarks;

    private List<PatientCombineMedicineDetail> patientCombineMedicineDetailList;
}
