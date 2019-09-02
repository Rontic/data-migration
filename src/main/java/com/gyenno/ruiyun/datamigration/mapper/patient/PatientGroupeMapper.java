package com.gyenno.ruiyun.datamigration.mapper.patient;

import com.gyenno.ruiyun.datamigration.model.patient.PatientGroupe;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
@Component
public interface PatientGroupeMapper {

    int deleteByPrimaryKey(String id);

    int insert(PatientGroupe record);

    int insertSelective(PatientGroupe record);

    PatientGroupe selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(PatientGroupe record);

    int updateByPrimaryKey(PatientGroupe record);
}
