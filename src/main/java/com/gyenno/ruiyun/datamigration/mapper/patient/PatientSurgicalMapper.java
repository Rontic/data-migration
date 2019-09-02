package com.gyenno.ruiyun.datamigration.mapper.patient;

import com.gyenno.ruiyun.datamigration.model.patient.PatientSurgical;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
@Component
public interface PatientSurgicalMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(PatientSurgical record);

    int insertSelective(PatientSurgical record);

    PatientSurgical selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PatientSurgical record);
}
