package com.gyenno.ruiyun.datamigration.mapper.patient;

import com.gyenno.ruiyun.datamigration.model.patient.PatientPhytheTms;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
@Component
public interface PatientPhytheTmsMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(PatientPhytheTms record);

    int insertSelective(PatientPhytheTms record);

    PatientPhytheTms selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PatientPhytheTms record);

    int updateByPrimaryKey(PatientPhytheTms record);
}
