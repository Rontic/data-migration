package com.gyenno.ruiyun.datamigration.model.patient;

import lombok.Data;

import java.util.Date;

@Data
public class PatientGeneMutationInfo {
    private Integer id;

    private Integer gid;

    private String bid;

    private Integer type;

    private String updateBy;

    private Date updateDate;

    private String createBy;

    private Date createDate;

    private String remark;
}
