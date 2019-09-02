package com.gyenno.ruiyun.datamigration.mapper.patient;

import com.gyenno.ruiyun.datamigration.model.patient.PatientAdverse;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
@Component
public interface PatientAdverseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PatientAdverse record);

    int insertSelective(PatientAdverse record);

    PatientAdverse selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PatientAdverse record);

    int updateByPrimaryKey(PatientAdverse record);
}
