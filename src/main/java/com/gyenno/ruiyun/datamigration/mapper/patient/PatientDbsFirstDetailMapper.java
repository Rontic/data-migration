package com.gyenno.ruiyun.datamigration.mapper.patient;

import com.gyenno.ruiyun.datamigration.model.patient.PatientDbsFirstDetail;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
@Component
public interface PatientDbsFirstDetailMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(PatientDbsFirstDetail record);

    int insertSelective(PatientDbsFirstDetail record);

    PatientDbsFirstDetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PatientDbsFirstDetail record);

    int updateByPrimaryKey(PatientDbsFirstDetail record);
}
