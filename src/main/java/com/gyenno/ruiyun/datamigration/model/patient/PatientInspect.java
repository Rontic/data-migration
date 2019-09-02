package com.gyenno.ruiyun.datamigration.model.patient;

import lombok.Data;

import java.util.Date;

@Data
public class PatientInspect {
    private Integer id;

    private Integer patientId;

    private String inspectionId;

    private String serialNumber;

    private String dualTask;

    private String isChecked;

    private String remark;

    private String createBy;

    private String updateBy;

    private Date createDate;

    private Date updateDate;

    private String checkType;

    private Integer order;

    private String orgId;

    private String taskCode;
}
