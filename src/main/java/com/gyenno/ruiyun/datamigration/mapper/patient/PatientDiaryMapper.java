package com.gyenno.ruiyun.datamigration.mapper.patient;

import com.gyenno.ruiyun.datamigration.model.patient.PatientDiary;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
@Component
public interface PatientDiaryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PatientDiary record);

    int insertSelective(PatientDiary record);

    PatientDiary selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PatientDiary record);

    int updateByPrimaryKey(PatientDiary record);
}
