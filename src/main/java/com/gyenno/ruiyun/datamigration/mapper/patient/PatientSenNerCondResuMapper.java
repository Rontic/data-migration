package com.gyenno.ruiyun.datamigration.mapper.patient;

import com.gyenno.ruiyun.datamigration.model.patient.PatientSenNerCondResu;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
@Component
public interface PatientSenNerCondResuMapper {
    int deleteByPrimaryKey(String id);

    int insert(PatientSenNerCondResu record);

    int insertSelective(PatientSenNerCondResu record);

    PatientSenNerCondResu selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(PatientSenNerCondResu record);

    int updateByPrimaryKey(PatientSenNerCondResu record);
}
