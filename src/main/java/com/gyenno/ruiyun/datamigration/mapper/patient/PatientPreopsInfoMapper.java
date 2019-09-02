package com.gyenno.ruiyun.datamigration.mapper.patient;

import com.gyenno.ruiyun.datamigration.model.patient.PatientPreopsInfo;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
@Component
public interface PatientPreopsInfoMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(PatientPreopsInfo record);

    int insertSelective(PatientPreopsInfo record);

    PatientPreopsInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PatientPreopsInfo record);

    int updateByPrimaryKey(PatientPreopsInfo record);
}
