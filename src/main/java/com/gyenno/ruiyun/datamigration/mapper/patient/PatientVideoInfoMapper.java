package com.gyenno.ruiyun.datamigration.mapper.patient;

import com.gyenno.ruiyun.datamigration.model.patient.PatientVideoInfo;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
@Component
public interface PatientVideoInfoMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(PatientVideoInfo record);

    int insertSelective(PatientVideoInfo record);

    PatientVideoInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PatientVideoInfo record);
}
