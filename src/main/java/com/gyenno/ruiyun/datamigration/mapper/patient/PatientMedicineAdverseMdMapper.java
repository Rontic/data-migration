package com.gyenno.ruiyun.datamigration.mapper.patient;

import com.gyenno.ruiyun.datamigration.model.patient.PatientMedicineAdverseMd;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface PatientMedicineAdverseMdMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PatientMedicineAdverseMd record);

    int insertSelective(PatientMedicineAdverseMd record);

    PatientMedicineAdverseMd selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PatientMedicineAdverseMd record);

    int updateByPrimaryKey(PatientMedicineAdverseMd record);
}
