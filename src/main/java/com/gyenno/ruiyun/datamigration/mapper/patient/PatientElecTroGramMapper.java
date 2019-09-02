package com.gyenno.ruiyun.datamigration.mapper.patient;

import com.gyenno.ruiyun.datamigration.model.patient.PatientElecTroGram;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface PatientElecTroGramMapper {

    int deleteByPrimaryKey(String id);

    int insert(PatientElecTroGram record);

    int insertSelective(PatientElecTroGram record);

    PatientElecTroGram selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(PatientElecTroGram record);
}
