package com.gyenno.ruiyun.datamigration.mapper.patient;

import com.gyenno.ruiyun.datamigration.model.patient.PatElecTroGram;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
@Component
public interface PatElecTroGramMapper {

    int deleteByPrimaryKey(String id);

    int insert(PatElecTroGram record);

    int insertSelective(PatElecTroGram record);

    PatElecTroGram selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(PatElecTroGram record);
}
