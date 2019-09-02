package com.gyenno.ruiyun.datamigration.mapper.patient;

import com.gyenno.ruiyun.datamigration.model.patient.PatientHistory;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
@Component
public interface PatientHistoryMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(PatientHistory record);

    int insertSelective(PatientHistory record);

    PatientHistory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PatientHistory record);
}
