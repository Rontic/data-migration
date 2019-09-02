package com.gyenno.ruiyun.datamigration.mapper.patient;

import com.gyenno.ruiyun.datamigration.model.patient.PatientPhytheAssess;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
@Component
public interface PatientPhytheAssessMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(PatientPhytheAssess record);

    int insertSelective(PatientPhytheAssess record);

    PatientPhytheAssess selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PatientPhytheAssess record);

    int updateByPrimaryKey(PatientPhytheAssess record);
}
