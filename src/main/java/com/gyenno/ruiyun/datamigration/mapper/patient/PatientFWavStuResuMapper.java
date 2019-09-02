package com.gyenno.ruiyun.datamigration.mapper.patient;

import com.gyenno.ruiyun.datamigration.model.patient.PatientFWavStuResu;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
@Component
public interface PatientFWavStuResuMapper {

    int deleteByPrimaryKey(String id);

    int insert(PatientFWavStuResu record);

    int insertSelective(PatientFWavStuResu record);

    PatientFWavStuResu selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(PatientFWavStuResu record);

    int updateByPrimaryKey(PatientFWavStuResu record);
}
