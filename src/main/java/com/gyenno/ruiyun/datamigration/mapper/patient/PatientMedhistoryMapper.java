package com.gyenno.ruiyun.datamigration.mapper.patient;

import com.gyenno.ruiyun.datamigration.model.patient.PatientMedhistory;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
@Component
public interface PatientMedhistoryMapper {

    int deleteByPrimaryKey(String id);

    int insert(PatientMedhistory record);

    int insertSelective(PatientMedhistory record);

    PatientMedhistory selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(PatientMedhistory record);

}
