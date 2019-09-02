package com.gyenno.ruiyun.datamigration.mapper.patient;

import com.gyenno.ruiyun.datamigration.model.patient.PatientMotUniAna;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
@Component
public interface PatientMotUniAnaMapper {

    int deleteByPrimaryKey(String id);

    int insert(PatientMotUniAna record);

    int insertSelective(PatientMotUniAna record);

    PatientMotUniAna selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(PatientMotUniAna record);
}
