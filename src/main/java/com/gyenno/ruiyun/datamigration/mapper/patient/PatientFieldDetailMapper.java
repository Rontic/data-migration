package com.gyenno.ruiyun.datamigration.mapper.patient;

import com.gyenno.ruiyun.datamigration.model.patient.PatientFieldDetail;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
@Component
public interface PatientFieldDetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PatientFieldDetail record);

    int insertSelective(PatientFieldDetail record);

    PatientFieldDetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PatientFieldDetail record);

    int updateByPrimaryKey(PatientFieldDetail record);
}
