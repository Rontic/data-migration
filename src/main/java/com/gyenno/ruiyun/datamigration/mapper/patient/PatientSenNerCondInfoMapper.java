package com.gyenno.ruiyun.datamigration.mapper.patient;

import com.gyenno.ruiyun.datamigration.model.patient.PatientSenNerCondInfo;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
@Component
public interface PatientSenNerCondInfoMapper {

    int deleteByPrimaryKey(String id);

    int insert(PatientSenNerCondInfo record);

    int insertSelective(PatientSenNerCondInfo record);

    PatientSenNerCondInfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(PatientSenNerCondInfo record);
}
