package com.gyenno.ruiyun.datamigration.mapper.patient;

import com.gyenno.ruiyun.datamigration.model.patient.PatientTreatment;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
@Component
public interface PatientTreatmentMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(PatientTreatment record);

    int insertSelective(PatientTreatment record);

    PatientTreatment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PatientTreatment record);
}
