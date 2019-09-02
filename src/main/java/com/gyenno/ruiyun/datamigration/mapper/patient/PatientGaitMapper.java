package com.gyenno.ruiyun.datamigration.mapper.patient;

import com.gyenno.ruiyun.datamigration.model.patient.PatientGait;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
@Component
public interface PatientGaitMapper {

    int deleteByPrimaryKey(String id);

    int insert(PatientGait record);

    int insertSelective(PatientGait record);

    PatientGait selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(PatientGait record);

    int updateByPrimaryKey(PatientGait record);
}
