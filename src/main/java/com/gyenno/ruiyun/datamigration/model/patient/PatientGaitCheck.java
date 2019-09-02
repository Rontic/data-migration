package com.gyenno.ruiyun.datamigration.model.patient;

import lombok.Data;

import java.util.Date;

@Data
public class PatientGaitCheck {
    private String id;

    private String gaitItemId;

    private String type;

    private String typeChild;

    private String typeCode;

    private String leftNormal;

    private String leftError;

    private String rightNormal;

    private String rightError;

    private String dataNormal;

    private String dataError;

    private String referenceValue;

    private String remark;

    private String createBy;

    private String updateBy;

    private Date createDate;

    private Date updateDate;

    private String unit;

    private String avgNormal;

    private String avgError;

    private String xAxis;
}
