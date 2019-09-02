package com.gyenno.ruiyun.datamigration.model.patient;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class PatientNerveSleep {
    private Integer id;

    private Date recordStart;

    private Date recordEnd;

    private Date recordTotal;

    private String height;

    private String weight;

    private String examResult;

    private String elecExamType;

    private String patientCaseId;

    private Integer patientId;

    private String createBy;

    private Date createDate;

    private String updateBy;

    private Date updateDate;

    private String remarks;

    private List<PatientFieldDetail> patientFieldDetailList;
}
