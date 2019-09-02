package com.gyenno.ruiyun.datamigration.mapper.patient;

import com.gyenno.ruiyun.datamigration.model.patient.PatientNerveSleep;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
@Component
public interface PatientNerveSleepMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(PatientNerveSleep record);

    int insertSelective(PatientNerveSleep record);

    PatientNerveSleep selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PatientNerveSleep record);

    int updateByPrimaryKey(PatientNerveSleep record);
}
