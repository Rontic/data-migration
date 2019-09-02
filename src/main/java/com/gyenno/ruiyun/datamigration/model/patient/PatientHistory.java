package com.gyenno.ruiyun.datamigration.model.patient;

import lombok.Data;

import java.util.Date;

@Data
public class PatientHistory {
    private Integer id;

    private Date ariseTime;

    private String createBy;

    private Date createDate;

    private String createName;

    private String doctorId;

    private String doctorName;

    private String hospName;

    private String updateBy;

    private Date updateDate;

    private String updateName;

    private Integer patientId;

    private Integer version;

    private String givenMedicine;

    private String curativeEffect;

    private Integer hospitalizationTimes;

    private String inpatientCause;

    private String chiefComplaint;

    private String remarks;

    private String diagnosis;
}
