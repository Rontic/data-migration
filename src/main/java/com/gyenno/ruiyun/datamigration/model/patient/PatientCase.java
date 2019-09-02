package com.gyenno.ruiyun.datamigration.model.patient;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class PatientCase {
    private String id;

    private String caseName;

    private String createBy;

    private Date createDate;

    private String createName;

    private Date diagTime;

    private String docId;

    private String docName;

    private String hospId;

    private String hospName;

    private String updateBy;

    private Date updateDate;

    private String updateName;

    private Integer patientId;

    private Integer version;

    private String bpOrthostatic;

    private String breathing;

    private String doiCdr;

    private String doiMmse;

    private String doiMoca;

    private String heartRate;

    private String medicineimageBrief;

    private String pulse;

    private Byte rhythm;

    private String temperature;

    private String bpDecubitus;

    private Integer caseType;

    private Integer archiveStatus;

    private Integer diseaseType;

    private String caseSymptom;

    private String bloodCode;

    private String geneDetectionName;

    private String geneDetectionResult;

    private String tcsResult;

    private String bpSitting;

    private Integer specificDisease;

    private Integer diagnoseState;

    private Integer patientExperimentId;

    private Byte isPayed;

    private Integer taskInfoId;

    private String payDate;

    private String tcmType;

    private Integer followTimes;

    private Integer isAccompany;

    private String medicineBrief;

    private String remarks;

    private String scaleBrief;

    private String sideeffectBrief;

    private String spephysicalBrief;

    private String surgicalBrief;

    private String symName;

    private String bioexamBrief;

    private String etgBrief;

    private String auxiliaryexamBrief;

    private List<PatientScale> patientScaleList;

    private List<PatientDependentAccompanying> patientDependentAccompanyingList;

    private List<PatientPaperOption> patientCasePaperOptionList;

    private List<PatientDiseaseComplication> patientDiseaseComplicationList;

    private List<PatientSymptom> patientSymptomList;

    private List<PatientGait> patientGaitList;

    private List<PatientCombineMedicine> patientCombineMedicineList;

    private List<PatientMedicine> patientMedicineList;

    private List<PatientDiary> patientDiaryList;

    private List<PatientVideoInfo> patientVideoInfoList;

    private List<PatientElecTroGram> patientElecTroGramList;

    private List<PatientNerveSleep> patientNerveSleepList;

    private List<PatientBioexam> patientBioexamList;

    private List<PatientBodypart> patientBodypartList;

    private List<PatientAdverse> patientAdverseList;

    private List<PatientVitalSign> patientVitalSignList;

    private List<PatientPhytheTms> patientPhytheTmsList;

    private List<PatientPreopsInfo> patientPreopsInfoList;

    private List<PatientTreatment> patientTreatmentList;

    private List<PatientComplication> patientComplicationList;

    private List<PatientDbsFirst> patientDbsFirstList;

    private List<PatientDbsFollow> patientDbsFollowList;

    private List<PatientPhytheAssess> patientPhytheAccessList;

    private List<PatientAdverseSerious> patientAdverseSeriousList;

    private List<PatientMedicineAdverse> patientMedicineAdverseList;

    private List<PatientSpephysical> patientSpephysicalList;
}
