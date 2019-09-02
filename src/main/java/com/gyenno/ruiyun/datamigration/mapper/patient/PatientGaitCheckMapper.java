package com.gyenno.ruiyun.datamigration.mapper.patient;

import com.gyenno.ruiyun.datamigration.model.patient.PatientGaitCheck;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
@Component
public interface PatientGaitCheckMapper {

    int deleteByPrimaryKey(String id);

    int insert(PatientGaitCheck record);

    int insertSelective(PatientGaitCheck record);

    PatientGaitCheck selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(PatientGaitCheck record);

    int updateByPrimaryKey(PatientGaitCheck record);
}
