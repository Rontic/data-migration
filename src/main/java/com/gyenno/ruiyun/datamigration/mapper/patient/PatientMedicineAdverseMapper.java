package com.gyenno.ruiyun.datamigration.mapper.patient;

import com.gyenno.ruiyun.datamigration.model.patient.PatientMedicineAdverse;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
@Component
public interface PatientMedicineAdverseMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(PatientMedicineAdverse record);

    int insertSelective(PatientMedicineAdverse record);

    PatientMedicineAdverse selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PatientMedicineAdverse record);

    int updateByPrimaryKey(PatientMedicineAdverse record);
}
