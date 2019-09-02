package com.gyenno.ruiyun.datamigration.mapper.patient;

import com.gyenno.ruiyun.datamigration.model.patient.PatientDbsChoose;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
@Component
public interface PatientDbsChooseMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(PatientDbsChoose record);

    int insertSelective(PatientDbsChoose record);

    PatientDbsChoose selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PatientDbsChoose record);

    int updateByPrimaryKey(PatientDbsChoose record);
}
