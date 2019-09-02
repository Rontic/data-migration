package com.gyenno.ruiyun.datamigration.mapper.patient;

import com.gyenno.ruiyun.datamigration.model.patient.PatientDbsFirst;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
@Component
public interface PatientDbsFirstMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(PatientDbsFirst record);

    int insertSelective(PatientDbsFirst record);

    PatientDbsFirst selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PatientDbsFirst record);

    int updateByPrimaryKey(PatientDbsFirst record);
}
