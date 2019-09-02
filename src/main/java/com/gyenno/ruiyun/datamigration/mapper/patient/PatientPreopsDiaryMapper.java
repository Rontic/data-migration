package com.gyenno.ruiyun.datamigration.mapper.patient;

import com.gyenno.ruiyun.datamigration.model.patient.PatientPreopsDiary;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
@Component
public interface PatientPreopsDiaryMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(PatientPreopsDiary record);

    int insertSelective(PatientPreopsDiary record);

    PatientPreopsDiary selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PatientPreopsDiary record);

    int updateByPrimaryKey(PatientPreopsDiary record);
}
