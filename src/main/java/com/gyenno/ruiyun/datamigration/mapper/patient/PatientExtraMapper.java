package com.gyenno.ruiyun.datamigration.mapper.patient;

import com.gyenno.ruiyun.datamigration.model.patient.PatientExtra;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
@Component
public interface PatientExtraMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(PatientExtra record);

    int insertSelective(PatientExtra record);

    PatientExtra selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PatientExtra record);
}
