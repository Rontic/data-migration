package com.gyenno.ruiyun.datamigration.mapper.patient;

import com.gyenno.ruiyun.datamigration.model.patient.PatientHabit;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
@Component
public interface PatientHabitMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(PatientHabit record);

    int insertSelective(PatientHabit record);

    PatientHabit selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PatientHabit record);
}
