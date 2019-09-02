package com.gyenno.ruiyun.datamigration.mapper.patient;

import com.gyenno.ruiyun.datamigration.model.patient.PatientMotNerCondInfo;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
@Component
public interface PatientMotNerCondInfoMapper {

    int deleteByPrimaryKey(String id);

    int insert(PatientMotNerCondInfo record);

    int insertSelective(PatientMotNerCondInfo record);

    PatientMotNerCondInfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(PatientMotNerCondInfo record);
}
