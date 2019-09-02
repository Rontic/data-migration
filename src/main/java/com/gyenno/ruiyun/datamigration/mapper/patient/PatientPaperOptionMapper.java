package com.gyenno.ruiyun.datamigration.mapper.patient;

import com.gyenno.ruiyun.datamigration.model.patient.PatientPaperOption;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
@Component
public interface PatientPaperOptionMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(PatientPaperOption record);

    int insertSelective(PatientPaperOption record);

    PatientPaperOption selectByPrimaryKey(Integer id);
}
