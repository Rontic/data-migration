package com.gyenno.ruiyun.datamigration.mapper.patient;

import com.gyenno.ruiyun.datamigration.model.patient.PatientBodypart;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface PatientBodypartMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(PatientBodypart record);

    int insertSelective(PatientBodypart record);

    PatientBodypart selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PatientBodypart record);

    int updateByPrimaryKey(PatientBodypart record);
}
