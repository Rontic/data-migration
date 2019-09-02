package com.gyenno.ruiyun.datamigration.mapper.patient;

import com.gyenno.ruiyun.datamigration.model.patient.PatientSpephysical;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface PatientSpephysicalMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(PatientSpephysical record);

    int insertSelective(PatientSpephysical record);

    PatientSpephysical selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PatientSpephysical record);

    int updateByPrimaryKey(PatientSpephysical record);
}
