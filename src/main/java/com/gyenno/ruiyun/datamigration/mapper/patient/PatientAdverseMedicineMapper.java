package com.gyenno.ruiyun.datamigration.mapper.patient;

import com.gyenno.ruiyun.datamigration.model.patient.PatientAdverseMedicine;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
@Component
public interface PatientAdverseMedicineMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PatientAdverseMedicine record);

    int insertSelective(PatientAdverseMedicine record);

    PatientAdverseMedicine selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PatientAdverseMedicine record);

    int updateByPrimaryKey(PatientAdverseMedicine record);
}
