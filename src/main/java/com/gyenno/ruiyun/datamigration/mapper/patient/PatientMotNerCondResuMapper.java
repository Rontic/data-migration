package com.gyenno.ruiyun.datamigration.mapper.patient;

import com.gyenno.ruiyun.datamigration.model.patient.PatientMotNerCondResu;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
@Component
public interface PatientMotNerCondResuMapper {

    int deleteByPrimaryKey(String id);

    int insert(PatientMotNerCondResu record);

    int insertSelective(PatientMotNerCondResu record);

    PatientMotNerCondResu selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(PatientMotNerCondResu record);

    int updateByPrimaryKey(PatientMotNerCondResu record);
}
