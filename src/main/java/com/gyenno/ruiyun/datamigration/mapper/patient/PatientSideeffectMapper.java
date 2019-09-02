package com.gyenno.ruiyun.datamigration.mapper.patient;

import com.gyenno.ruiyun.datamigration.model.patient.PatientSideeffect;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
@Component
public interface PatientSideeffectMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(PatientSideeffect record);

    int insertSelective(PatientSideeffect record);

    PatientSideeffect selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PatientSideeffect record);
}
