package com.gyenno.ruiyun.datamigration.mapper.patient;

import com.gyenno.ruiyun.datamigration.model.patient.PatientSampleRetention;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface PatientSampleRetentionMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(PatientSampleRetention record);

    int insertSelective(PatientSampleRetention record);

    PatientSampleRetention selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PatientSampleRetention record);

    int updateByPrimaryKey(PatientSampleRetention record);
}
