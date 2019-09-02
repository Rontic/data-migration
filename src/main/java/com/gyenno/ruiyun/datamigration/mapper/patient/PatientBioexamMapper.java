package com.gyenno.ruiyun.datamigration.mapper.patient;

import com.gyenno.ruiyun.datamigration.model.patient.PatientBioexam;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
@Component
public interface PatientBioexamMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(PatientBioexam record);

    int insertSelective(PatientBioexam record);

    PatientBioexam selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PatientBioexam record);
}
