package com.gyenno.ruiyun.datamigration.model.patient;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class PatientGait {
    private String id;

    private String serialNumber;

    private Integer patientId;

    private Date acquisitionStartTime;

    private Date acquisitionEndTime;

    private Date checkTime;

    private String checkDoctor;

    private String toExamineDoctor;

    private Integer equipmentModel;

    private String equipmentNumber;

    private String checkNumber;

    private String dataSources;

    private String type;

    private Integer inspectId;

    private String remark;

    private String result;

    private String createBy;

    private String updateBy;

    private Date createDate;

    private Date updateDate;

    private Integer taskInfoId;

    private String step;

    private String patientCaseId;

    private String inspectionId;

    private String nodeMode;

    private Integer nodeCount;

    private Short switchType;

    private Short isSynchroScore;

    private String patientScaleId;

    private String updrs3Point;

    private String lastMedicineTime;

    private List<PatientGaitItem> patientGaitItemList;

    private List<PatientInspect> patientInspectList;
}
