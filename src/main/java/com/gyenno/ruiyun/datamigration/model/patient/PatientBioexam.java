package com.gyenno.ruiyun.datamigration.model.patient;

import lombok.Data;
import java.util.Date;
import java.util.List;

@Data
public class PatientBioexam {
    private Integer id;

    private String createBy;

    private Date createDate;

    private String createName;

    private Date checkDate;

    private String bloodCode;

    private String updateBy;

    private Date updateDate;

    private String updateName;

    private Integer bioexamId;

    private String patientCaseId;

    private Integer patientId;

    private String file;

    private Integer isGenMutationInfo;

    private Integer sampleCollectionFlg;

    private String projectResults;

    private String remarks;

    private List<PatientBioexamResult> patientBioexamResultList;

    private List<PatientGeneMutationInfo> patientGeneMutationInfoList;
}
