package com.gyenno.ruiyun.datamigration.mapper.patient;

import com.gyenno.ruiyun.datamigration.model.patient.PatientFirstSymbol;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
@Component
public interface PatientFirstSymbolMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(PatientFirstSymbol record);

    int insertSelective(PatientFirstSymbol record);

    PatientFirstSymbol selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PatientFirstSymbol record);
}
