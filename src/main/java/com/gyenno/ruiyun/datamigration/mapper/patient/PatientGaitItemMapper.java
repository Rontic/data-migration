package com.gyenno.ruiyun.datamigration.mapper.patient;

import com.gyenno.ruiyun.datamigration.model.patient.PatientGaitItem;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
@Component
public interface PatientGaitItemMapper {

    int deleteByPrimaryKey(String id);

    int insert(PatientGaitItem record);

    int insertSelective(PatientGaitItem record);

    PatientGaitItem selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(PatientGaitItem record);

    int updateByPrimaryKey(PatientGaitItem record);
}
