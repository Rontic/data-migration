package com.gyenno.ruiyun.datamigration.mapper.patient;

import com.gyenno.ruiyun.datamigration.model.patient.PatientIntPatAnaItem;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
@Component
public interface PatientIntPatAnaItemMapper {
    int deleteByPrimaryKey(String id);

    int insert(PatientIntPatAnaItem record);

    int insertSelective(PatientIntPatAnaItem record);

    PatientIntPatAnaItem selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(PatientIntPatAnaItem record);

    int updateByPrimaryKey(PatientIntPatAnaItem record);
}
