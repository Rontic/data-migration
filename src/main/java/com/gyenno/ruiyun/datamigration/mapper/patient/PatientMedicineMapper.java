package com.gyenno.ruiyun.datamigration.mapper.patient;

import com.gyenno.ruiyun.datamigration.model.patient.PatientMedicine;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
@Component
public interface PatientMedicineMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PatientMedicine record);

    int insertSelective(PatientMedicine record);

    PatientMedicine selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PatientMedicine record);
}
