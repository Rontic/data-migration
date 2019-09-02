package com.gyenno.ruiyun.datamigration.service.patient;

import com.gyenno.ruiyun.datamigration.model.patient.PatientWholeInfo;

import java.util.List;

public interface PatientService {
    public List<PatientWholeInfo> getAlonePatientWholeInfo();

    public List<PatientWholeInfo> getCloudPatientWholeInfo();
}
