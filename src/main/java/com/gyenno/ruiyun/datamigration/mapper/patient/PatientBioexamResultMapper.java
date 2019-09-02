package com.gyenno.ruiyun.datamigration.mapper.patient;

import com.gyenno.ruiyun.datamigration.model.patient.PatientBioexamResult;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
@Component
public interface PatientBioexamResultMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(PatientBioexamResult record);

    int insertSelective(PatientBioexamResult record);

    PatientBioexamResult selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PatientBioexamResult record);
}
