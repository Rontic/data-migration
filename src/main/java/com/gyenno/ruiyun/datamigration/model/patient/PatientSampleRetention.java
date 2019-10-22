package com.gyenno.ruiyun.datamigration.model.patient;

import lombok.Data;

import java.util.Date;

@Data
public class PatientSampleRetention {
    private Integer id;

    private String createBy;

    private String createName;

    private Date createDate;

    private Integer geneDetectionCode;

    private Date geneDetectionDate;

    private String geneDetectionSamplenumber;

    private Integer salivaCollectionCode;

    private Date salivaCollectionDate;

    private String salivaCollectionSamplenumber;

    private Integer spouseSalivaCode;

    private Date spouseSalivaDate;

    private String spouseSalivaSamplenumber;

    private Integer bloodCollectionCode;

    private Date bloodCollectionDate;

    private String bloodCollectionSamplenumber;

    private Integer spouseBloodCode;

    private Date spouseBloodDate;

    private String spouseBloodSamplenumber;

    private Integer urineCollectionCode;

    private Date urineCollectionDate;

    private String urineCollectionSamplenumber;

    private Integer fmriCode;

    private Date fmriDate;

    private String fmriSamplenumber;

    private String patientCaseId;

    private Integer patientId;

    private String updateBy;

    private String updateName;

    private Date updateDate;

    private String files;

    private String remarks;
}
