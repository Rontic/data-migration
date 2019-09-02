package com.gyenno.ruiyun.datamigration.mapper.patient;

import com.gyenno.ruiyun.datamigration.model.patient.PatientOption;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
@Component
public interface PatientOptionMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(PatientOption record);

    int insertSelective(PatientOption record);

    PatientOption selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PatientOption record);
}
