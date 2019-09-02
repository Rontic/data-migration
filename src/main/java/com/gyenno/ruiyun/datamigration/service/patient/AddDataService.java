package com.gyenno.ruiyun.datamigration.service.patient;

import com.gyenno.ruiyun.datamigration.model.patient.PatientVideoInfo;
import com.gyenno.ruiyun.datamigration.model.patient.PatientVitalSign;
import com.gyenno.ruiyun.datamigration.model.patient.PatientVitalSignDetail;
import com.gyenno.ruiyun.datamigration.model.patient.PatientWholeInfo;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;

public interface AddDataService {

    public void insetWholeData(List<PatientWholeInfo> patientWholeInfoList);
}
