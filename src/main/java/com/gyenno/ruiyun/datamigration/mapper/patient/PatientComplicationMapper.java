package com.gyenno.ruiyun.datamigration.mapper.patient;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.gyenno.ruiyun.datamigration.model.patient.PatientComplication;

@Mapper
@Component
public interface PatientComplicationMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(PatientComplication record);

    int insertSelective(PatientComplication record);

    PatientComplication selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PatientComplication record);
}
