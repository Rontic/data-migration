package com.gyenno.ruiyun.datamigration.mapper.patient;

import com.gyenno.ruiyun.datamigration.model.patient.PatientPreopsMedicine;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
@Component
public interface PatientPreopsMedicineMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(PatientPreopsMedicine record);

    int insertSelective(PatientPreopsMedicine record);

    PatientPreopsMedicine selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PatientPreopsMedicine record);

    int updateByPrimaryKey(PatientPreopsMedicine record);
}
