package com.gyenno.ruiyun.datamigration.mapper.patient;

import com.gyenno.ruiyun.datamigration.model.patient.PatientPreopsScale;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
@Component
public interface PatientPreopsScaleMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(PatientPreopsScale record);

    int insertSelective(PatientPreopsScale record);

    PatientPreopsScale selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PatientPreopsScale record);
}
