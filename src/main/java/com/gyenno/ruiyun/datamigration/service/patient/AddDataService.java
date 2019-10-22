package com.gyenno.ruiyun.datamigration.service.patient;

import com.gyenno.ruiyun.datamigration.model.patient.*;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;

public interface AddDataService {

    public void insetWholeData(List<PatientWholeInfo> patientWholeInfoList);
}
