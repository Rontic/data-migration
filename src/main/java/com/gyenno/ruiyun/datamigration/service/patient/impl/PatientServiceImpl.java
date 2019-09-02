package com.gyenno.ruiyun.datamigration.service.patient.impl;

import com.gyenno.ruiyun.datamigration.annotation.DataBase;
import com.gyenno.ruiyun.datamigration.mapper.patient.PatientWholeInfoMapper;
import com.gyenno.ruiyun.datamigration.model.patient.PatientWholeInfo;
import com.gyenno.ruiyun.datamigration.service.patient.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientWholeInfoMapper patientWholeInfoMapper;

    @Override
    @DataBase("dbalone")
    public List<PatientWholeInfo> getAlonePatientWholeInfo() {
        return patientWholeInfoMapper.selectAllPatientInfo();
    }

    @Override
    @DataBase("dbcloud")
    public List<PatientWholeInfo> getCloudPatientWholeInfo() {
        return patientWholeInfoMapper.selectAllPatientInfo();
    }
}
