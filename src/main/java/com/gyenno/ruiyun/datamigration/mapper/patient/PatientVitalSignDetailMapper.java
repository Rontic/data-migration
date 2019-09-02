package com.gyenno.ruiyun.datamigration.mapper.patient;

import com.gyenno.ruiyun.datamigration.model.patient.PatientVitalSignDetail;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
@Component
public interface PatientVitalSignDetailMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(PatientVitalSignDetail list);

    int insertSelective(PatientVitalSignDetail list);

    PatientVitalSignDetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PatientVitalSignDetail record);

    int updateByPrimaryKey(PatientVitalSignDetail record);
}
