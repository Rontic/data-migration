package com.gyenno.ruiyun.datamigration.mapper.patient;

import com.gyenno.ruiyun.datamigration.model.patient.PatientDbsParameter;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
@Component
public interface PatientDbsParameterMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PatientDbsParameter record);

    int insertSelective(PatientDbsParameter record);

    PatientDbsParameter selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PatientDbsParameter record);
}
