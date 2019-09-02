package com.gyenno.ruiyun.datamigration.mapper.patient;

import com.gyenno.ruiyun.datamigration.model.patient.PatientMedicineDetail;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
@Component
public interface PatientMedicineDetailMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(PatientMedicineDetail record);

    int insertSelective(PatientMedicineDetail record);

    PatientMedicineDetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PatientMedicineDetail record);

    int updateByPrimaryKey(PatientMedicineDetail record);
}
