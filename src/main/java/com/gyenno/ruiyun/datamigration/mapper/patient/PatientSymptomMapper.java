package com.gyenno.ruiyun.datamigration.mapper.patient;

import com.gyenno.ruiyun.datamigration.model.patient.PatientSymptom;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
@Component
public interface PatientSymptomMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(PatientSymptom record);

    int insertSelective(PatientSymptom record);

    PatientSymptom selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PatientSymptom record);

    int updateByPrimaryKey(PatientSymptom record);
}
