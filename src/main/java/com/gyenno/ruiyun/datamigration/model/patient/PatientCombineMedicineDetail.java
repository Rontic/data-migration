package com.gyenno.ruiyun.datamigration.model.patient;

import lombok.Data;

import java.util.Date;

@Data
public class PatientCombineMedicineDetail {
    private Integer id;

    private Integer computUnit;

    private String createBy;

    private Date createDate;

    private String createName;

    private String takeDose;

    private String takeTime;

    private String updateBy;

    private Date updateDate;

    private String updateName;

    private Integer combineMedicineId;
}
