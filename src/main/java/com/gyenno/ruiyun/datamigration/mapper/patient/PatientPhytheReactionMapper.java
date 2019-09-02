package com.gyenno.ruiyun.datamigration.mapper.patient;

import com.gyenno.ruiyun.datamigration.model.patient.PatientPhytheReaction;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
@Component
public interface PatientPhytheReactionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PatientPhytheReaction record);

    int insertSelective(PatientPhytheReaction record);

    PatientPhytheReaction selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PatientPhytheReaction record);

    int updateByPrimaryKey(PatientPhytheReaction record);
}
