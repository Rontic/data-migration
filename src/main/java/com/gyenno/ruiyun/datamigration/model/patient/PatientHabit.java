package com.gyenno.ruiyun.datamigration.model.patient;

import lombok.Data;

import java.util.Date;

@Data
public class PatientHabit {
    private Integer id;

    private String createBy;

    private Date createDate;

    private String createName;

    private String doseInfo;

    private Date endTime;

    private Date startTime;

    private String updateBy;

    private Date updateDate;

    private String updateName;

    private Integer patientHabitId;

    private Integer patientId;

    private Integer version;

    private Integer unit;

    private String yearsOfSmoking;

    private String yearsOfWine;

    private String stopYears;

    private String yearsOfTea;

    private String yearsOfCoffee;

    private Integer questionInfo;

    private Integer questionInfos;

    private String tastePreference;

    private Integer staplePreference;

    private String sleepLatency;

    private String snoringTime;

    private String substanceAbuse;

    private String remarks;
}
