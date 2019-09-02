package com.gyenno.ruiyun.datamigration.mapper.patient;

import com.gyenno.ruiyun.datamigration.model.patient.PatientDisease;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
@Component
public interface PatientDiseaseMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(PatientDisease record);

    int insertSelective(PatientDisease record);

    PatientDisease selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PatientDisease record);
}
