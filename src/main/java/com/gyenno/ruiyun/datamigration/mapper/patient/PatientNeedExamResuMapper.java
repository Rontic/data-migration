package com.gyenno.ruiyun.datamigration.mapper.patient;

import com.gyenno.ruiyun.datamigration.model.patient.PatientNeedExamResu;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
@Component
public interface PatientNeedExamResuMapper {

    int deleteByPrimaryKey(String id);

    int insert(PatientNeedExamResu record);

    int insertSelective(PatientNeedExamResu record);

    PatientNeedExamResu selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(PatientNeedExamResu record);

    int updateByPrimaryKey(PatientNeedExamResu record);
}
