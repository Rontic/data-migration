package com.gyenno.ruiyun.datamigration.mapper.patient;

import com.gyenno.ruiyun.datamigration.model.patient.PatientDependents;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
@Component
public interface PatientDependentsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PatientDependents record);

    int insertSelective(PatientDependents record);

    PatientDependents selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PatientDependents record);

    int updateByPrimaryKey(PatientDependents record);
}
