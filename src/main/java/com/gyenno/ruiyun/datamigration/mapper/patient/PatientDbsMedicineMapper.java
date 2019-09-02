package com.gyenno.ruiyun.datamigration.mapper.patient;

import com.gyenno.ruiyun.datamigration.model.patient.PatientDbsMedicine;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
@Component
public interface PatientDbsMedicineMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(PatientDbsMedicine record);

    int insertSelective(PatientDbsMedicine record);

    PatientDbsMedicine selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PatientDbsMedicine record);

    int updateByPrimaryKey(PatientDbsMedicine record);
}
