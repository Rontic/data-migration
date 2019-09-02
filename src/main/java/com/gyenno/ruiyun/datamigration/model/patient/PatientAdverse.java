package com.gyenno.ruiyun.datamigration.model.patient;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class PatientAdverse {
    private Integer id;

    private Date occurTime;

    private String adverseName;

    private String adverseDescribe;

    private Byte measureFlag;

    private Byte severity;

    private Byte treatmentRelate;

    private Byte seriousFlag;

    private String seriousAdverse;

    private String remark;

    private String otherMeasure;

    private String aboratoryExam;

    private Byte adverseResult;

    private Date relieveDate;

    private Byte adverseEffect;

    private String patientCaseId;

    private Integer patientId;

    private String createBy;

    private Date createDate;

    private String updateBy;

    private Date updateDate;

    private Date endTime;

    private Byte outCome;

    private String expression;

    private String deathCause;

    private Date deathDate;

    private Byte correctFlag;

    private String treatRecord;

    private Byte exitTestFlag;

    private Byte unblindFlag;

    private Date unblindDate;

    private List<PatientAdverseMedicine> patientAdverseMedicineList;
}
