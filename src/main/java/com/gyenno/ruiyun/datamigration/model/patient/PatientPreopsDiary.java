package com.gyenno.ruiyun.datamigration.model.patient;

import lombok.Data;

import java.util.Date;

@Data
public class PatientPreopsDiary {
    private Integer id;

    private String createBy;

    private Date createDate;

    private String createName;

    private Integer dayCount;

    private Double fiveDayDiaryHour;

    private Integer fiveDayDiaryType;

    private Date fiveDayTime;

    private Double fourDayDiaryHour;

    private Integer fourDayDiaryType;

    private Date fourDayTime;

    private Double hourAverage;

    private Double oneDayDiaryHour;

    private Integer oneDayDiaryType;

    private Date oneDayTime;

    private Double sixDayDiaryHour;

    private Integer sixDayDiaryType;

    private Date sixDayTime;

    private Double threeDayDiaryHour;

    private Integer threeDayDiaryType;

    private Date threeDayTime;

    private Double twoDayDiaryHour;

    private Integer twoDayDiaryType;

    private Date twoDayTime;

    private String updateBy;

    private Date updateDate;

    private String updateName;

    private Integer patientPreopsInfoId;

    private Double sevenDayDiaryHour;

    private Integer sevenDayDiaryType;

    private Date sevenDayTime;
}
