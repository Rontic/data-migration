package com.gyenno.ruiyun.datamigration.model.patient;

import lombok.Data;

import java.util.Date;

@Data
public class PatientDiary {
    private Integer id;

    private String patientCaseId;

    private Date recordTime;

    private String getUpTime;

    private String sleepTime;

    private String daySleepTime;

    private Float daySleepHs;

    private Float allSleepHs;

    private String niceTime;

    private String badTime;

    private String createBy;

    private Date createDate;

    private String createName;

    private String updateBy;

    private Date updateDate;

    private String updateName;

    private Float niceHours;

    private Float badHours;

    private String remark;
}
