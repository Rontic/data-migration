package com.gyenno.ruiyun.datamigration.mapper.patient;

import com.gyenno.ruiyun.datamigration.model.patient.PatientGeneMutationInfo;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
@Component
public interface PatientGeneMutationInfoMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(PatientGeneMutationInfo record);

    int insertSelective(PatientGeneMutationInfo record);

    PatientGeneMutationInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PatientGeneMutationInfo record);

    int updateByPrimaryKey(PatientGeneMutationInfo record);
}
