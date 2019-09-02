package com.gyenno.ruiyun.datamigration.model.patient;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class PatientMedicineAdverse {
    private Integer id;

    private Date occurTime;

    private String adverseName;

    private String adverseDescribe;

    private Byte measureFlag;

    private Byte treatmentRelate;

    private Byte medicineDoseEffect;

    private Byte searchMedicineRelate;

    private Byte seriousFlag;

    private String seriousAdverse;

    private Date reportAdverseDate;

    private String otherMeasure;

    private String aboratoryExam;

    private Byte adverseResult;

    private Byte adverseEffect;

    private Date endTime;

    private Byte exitTestFlag;

    private String patientCaseId;

    private Integer patientId;

    private String createBy;

    private Date createDate;

    private String updateBy;

    private Date updateDate;

    private List<PatientMedicineAdverseMd> patientMedicineAdverseMdList;
}
