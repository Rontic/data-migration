package com.gyenno.ruiyun.datamigration.mapper.patient;

import com.gyenno.ruiyun.datamigration.model.patient.PatientDependentAccompanying;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
@Component
public interface PatientDependentAccompanyingMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(PatientDependentAccompanying record);

    int insertSelective(PatientDependentAccompanying record);

    PatientDependentAccompanying selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PatientDependentAccompanying record);

    int updateByPrimaryKey(PatientDependentAccompanying record);
}
