package com.gyenno.ruiyun.datamigration.mapper.patient;

import com.gyenno.ruiyun.datamigration.model.patient.PatientFWavStu;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
@Component
public interface PatientFWavStuMapper {

    int deleteByPrimaryKey(String id);

    int insert(PatientFWavStu record);

    int insertSelective(PatientFWavStu record);

    PatientFWavStu selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(PatientFWavStu record);
}
