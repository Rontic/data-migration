package com.gyenno.ruiyun.datamigration.mapper.patient;

import com.gyenno.ruiyun.datamigration.model.patient.PatientScaleFile;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
@Component
public interface PatientScaleFileMapper {
    int deleteByPrimaryKey(String id);

    int insert(PatientScaleFile record);

    int insertSelective(PatientScaleFile record);

    PatientScaleFile selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(PatientScaleFile record);

    int updateByPrimaryKey(PatientScaleFile record);
}
