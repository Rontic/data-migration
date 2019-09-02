package com.gyenno.ruiyun.datamigration.model.patient;

import lombok.Data;

import java.util.Date;

@Data
public class PatientDiseaseComplication {
    private Integer id;

    private String diseaseName;

    private Date ariTime;

    private Integer lastTime;

    private Boolean reasonType;

    private String reasonRemark;

    private Boolean treatmentType;

    private String treatmentRemark;

    private String remark;

    private String patientCaseId;

    private String createBy;

    private Date createDate;

    private String createName;

    private String updateBy;

    private Date updateDate;

    private String updateName;

    private Boolean delFlag;
}
