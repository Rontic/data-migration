package com.gyenno.ruiyun.datamigration.mapper.patient;

import com.gyenno.ruiyun.datamigration.model.patient.PatientScale;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
@Component
public interface PatientScaleMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(PatientScale record);

    int insertSelective(PatientScale record);

    PatientScale selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PatientScale record);
}
