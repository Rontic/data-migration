package com.gyenno.ruiyun.datamigration.mapper.patient;

import com.gyenno.ruiyun.datamigration.model.patient.PatientAccident;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
@Component
public interface PatientAccidentMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(PatientAccident record);

    int insertSelective(PatientAccident record);

    PatientAccident selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PatientAccident record);
}
