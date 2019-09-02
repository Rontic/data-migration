package com.gyenno.ruiyun.datamigration.model.patient;

import lombok.Data;

import java.util.Date;

@Data
public class PatientDbsChoose {
    private Integer id;

    private String createBy;

    private Date createDate;

    private String createName;

    private String updateBy;

    private Date updateDate;

    private String updateName;

    private Integer dbsChoose;

    private Integer patientDbsFirstId;

    private Integer patientDbsFollowId;
}
