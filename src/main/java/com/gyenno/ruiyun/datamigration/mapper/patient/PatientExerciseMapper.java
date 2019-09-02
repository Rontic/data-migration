package com.gyenno.ruiyun.datamigration.mapper.patient;

import com.gyenno.ruiyun.datamigration.model.patient.PatientExercise;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
@Component
public interface PatientExerciseMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(PatientExercise record);

    int insertSelective(PatientExercise record);

    PatientExercise selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PatientExercise record);
}
