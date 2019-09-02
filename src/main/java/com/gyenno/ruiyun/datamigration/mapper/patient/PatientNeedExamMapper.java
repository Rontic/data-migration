package com.gyenno.ruiyun.datamigration.mapper.patient;

import com.gyenno.ruiyun.datamigration.model.patient.PatientNeedExam;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
@Component
public interface PatientNeedExamMapper {

    int deleteByPrimaryKey(String id);

    int insert(PatientNeedExam record);

    int insertSelective(PatientNeedExam record);

    PatientNeedExam selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(PatientNeedExam record);
}
