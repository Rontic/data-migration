package com.gyenno.ruiyun.datamigration.mapper.patient;

import com.gyenno.ruiyun.datamigration.model.patient.PatientCase;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
@Component
public interface PatientCaseMapper {

    int deleteByPrimaryKey(String id);

    int insert(PatientCase record);

    int insertSelective(PatientCase record);

    PatientCase selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(PatientCase record);
}
