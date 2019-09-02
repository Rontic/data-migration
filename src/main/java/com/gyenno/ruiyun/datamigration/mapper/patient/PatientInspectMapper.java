package com.gyenno.ruiyun.datamigration.mapper.patient;

import com.gyenno.ruiyun.datamigration.model.patient.PatientInspect;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
@Component
public interface PatientInspectMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(PatientInspect record);

    int insertSelective(PatientInspect record);

    PatientInspect selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PatientInspect record);

    int updateByPrimaryKey(PatientInspect record);
}
