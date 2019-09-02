package com.gyenno.ruiyun.datamigration.mapper.patient;

import com.gyenno.ruiyun.datamigration.model.patient.PatientAdverseSerious;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
@Component
public interface PatientAdverseSeriousMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PatientAdverseSerious record);

    int insertSelective(PatientAdverseSerious record);

    PatientAdverseSerious selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PatientAdverseSerious record);

    int updateByPrimaryKey(PatientAdverseSerious record);
}
