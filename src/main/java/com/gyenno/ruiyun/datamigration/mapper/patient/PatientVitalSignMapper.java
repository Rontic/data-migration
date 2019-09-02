package com.gyenno.ruiyun.datamigration.mapper.patient;

import com.gyenno.ruiyun.datamigration.model.patient.PatientVitalSign;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
@Component
public interface PatientVitalSignMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PatientVitalSign list);

    int insertSelective(PatientVitalSign list);

    PatientVitalSign selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PatientVitalSign record);

    int updateByPrimaryKey(PatientVitalSign record);
}
