package com.gyenno.ruiyun.datamigration.mapper.patient;

import com.gyenno.ruiyun.datamigration.model.patient.PatientCideexposedHistory;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
@Component
public interface PatientCideexposedHistoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PatientCideexposedHistory record);

    int insertSelective(PatientCideexposedHistory record);

    PatientCideexposedHistory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PatientCideexposedHistory record);

    int updateByPrimaryKeyWithBLOBs(PatientCideexposedHistory record);

    int updateByPrimaryKey(PatientCideexposedHistory record);
}
