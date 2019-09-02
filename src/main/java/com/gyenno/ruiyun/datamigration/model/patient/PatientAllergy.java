package com.gyenno.ruiyun.datamigration.model.patient;

import lombok.Data;

import java.util.Date;

@Data
public class PatientAllergy {
    private Integer id;

    private Integer patientId;

    private String name;

    private Date startDate;

    private Date endDate;

    private Integer duration;

    private Integer exist;

    private String medication;

    private String remark;

    private String createBy;

    private Date createTime;

    private String updateBy;

    private Date updateTime;
}
