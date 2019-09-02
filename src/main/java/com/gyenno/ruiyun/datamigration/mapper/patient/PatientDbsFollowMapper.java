package com.gyenno.ruiyun.datamigration.mapper.patient;

import com.gyenno.ruiyun.datamigration.model.patient.PatientDbsFollow;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
@Component
public interface PatientDbsFollowMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(PatientDbsFollow record);

    int insertSelective(PatientDbsFollow record);

    PatientDbsFollow selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PatientDbsFollow record);

    int updateByPrimaryKey(PatientDbsFollow record);
}
