package com.gyenno.ruiyun.datamigration.mapper.patient;

import com.gyenno.ruiyun.datamigration.model.patient.PatientAllergy;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
@Component
public interface PatientAllergyMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(PatientAllergy record);

    int insertSelective(PatientAllergy record);

    PatientAllergy selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PatientAllergy record);

    int updateByPrimaryKey(PatientAllergy record);
}
