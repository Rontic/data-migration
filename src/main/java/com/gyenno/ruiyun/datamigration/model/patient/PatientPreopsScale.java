package com.gyenno.ruiyun.datamigration.model.patient;

import lombok.Data;

import java.util.Date;

@Data
public class PatientPreopsScale {
    private Integer id;

    private Date ariseTime;

    private Integer bodyStatus;

    private String createBy;

    private Date createDate;

    private String createName;

    private Integer drugFlag;

    private Double medImproveRatio;

    private Integer scaleInfo;

    private Double scaleScore;

    private Integer scaleType;

    private String updateBy;

    private Date updateDate;

    private String updateName;

    private Integer patientPreopsInfoId;

    private String scaleName;

    private String remarks;

    private String remarkList;

    private String patientScaleList;

    private String scoreList;

    private String timeList;
}
