package com.gyenno.ruiyun.datamigration.mapper.patient;

import com.gyenno.ruiyun.datamigration.model.patient.PatientIntPatAna;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
@Component
public interface PatientIntPatAnaMapper {

    int deleteByPrimaryKey(String id);

    int insert(PatientIntPatAna record);

    int insertSelective(PatientIntPatAna record);

    PatientIntPatAna selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(PatientIntPatAna record);
}
