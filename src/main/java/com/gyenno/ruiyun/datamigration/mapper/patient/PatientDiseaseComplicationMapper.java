package com.gyenno.ruiyun.datamigration.mapper.patient;

import com.gyenno.ruiyun.datamigration.model.patient.PatientDiseaseComplication;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
@Component
public interface PatientDiseaseComplicationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PatientDiseaseComplication record);

    int insertSelective(PatientDiseaseComplication record);

    PatientDiseaseComplication selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PatientDiseaseComplication record);

    int updateByPrimaryKey(PatientDiseaseComplication record);
}
