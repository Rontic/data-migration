package com.gyenno.ruiyun.datamigration.mapper.patient;

import com.gyenno.ruiyun.datamigration.model.patient.PatientInfo;

import com.gyenno.ruiyun.datamigration.model.patient.PatientWholeInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
@Component
public interface PatientInfoMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(PatientInfo record);

    int insertSelective(PatientWholeInfo record);

    PatientInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PatientInfo record);
}
