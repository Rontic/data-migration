package com.gyenno.ruiyun.datamigration.mapper.patient;

import com.gyenno.ruiyun.datamigration.model.patient.PatientMotUniAnaResu;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
@Component
public interface PatientMotUniAnaResuMapper {

    int deleteByPrimaryKey(String id);

    int insert(PatientMotUniAnaResu record);

    int insertSelective(PatientMotUniAnaResu record);

    PatientMotUniAnaResu selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(PatientMotUniAnaResu record);
}
