package com.gyenno.ruiyun.datamigration.model.patient;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class PatientVideoInfo {
    private Integer id;

    private Date checkdate;

    private String checkdevice;

    private String createBy;

    private Date createDate;

    private String createName;

    private String title;

    private String updateBy;

    private Date updateDate;

    private String updateName;

    private Integer videoType;

    private String deviceId;

    private String patientCaseId;

    private String attachmentId;

    private String checknum;

    private Integer magneticIntensity;

    private String diacelewidth;

    private String hippocampalDesc;

    private String basalGangliaDesc;

    private Boolean dat11c;

    private Boolean fdg18f;

    private String remarks;

    private String checkconclusion;

    private List<PatientAttachment> patientVideoAttachmentList;

    private List<PatientFieldDetail> patientFieldDetailList;
}
