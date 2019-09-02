package com.gyenno.ruiyun.datamigration.mapper.patient;

import com.gyenno.ruiyun.datamigration.model.patient.PatientFamilyHistory;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
@Component
public interface PatientFamilyHistoryMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(PatientFamilyHistory record);

    int insertSelective(PatientFamilyHistory record);

    PatientFamilyHistory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PatientFamilyHistory record);

    int updateByPrimaryKey(PatientFamilyHistory record);
}
