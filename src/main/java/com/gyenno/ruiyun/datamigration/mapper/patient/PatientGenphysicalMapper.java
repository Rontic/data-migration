package com.gyenno.ruiyun.datamigration.mapper.patient;

import com.gyenno.ruiyun.datamigration.model.patient.PatientGenphysical;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
@Component
public interface PatientGenphysicalMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(PatientGenphysical record);

    int insertSelective(PatientGenphysical record);

    PatientGenphysical selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PatientGenphysical record);
}
