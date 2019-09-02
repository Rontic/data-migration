package com.gyenno.ruiyun.datamigration.model.patient;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class PatientGaitItem {
    private String id;

    private String gaitId;

    private String type;

    private String typeCode;

    private String remark;

    private String createBy;

    private String updateBy;

    private Date createDate;

    private Date updateDate;

    private List<PatientGaitCheck> patientGaitCheckList;
}
