package com.gyenno.ruiyun.datamigration.mapper.patient;

import com.gyenno.ruiyun.datamigration.model.patient.PatientCombineMedicineDetail;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
@Component
public interface PatientCombineMedicineDetailMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(PatientCombineMedicineDetail record);

    int insertSelective(PatientCombineMedicineDetail record);

    PatientCombineMedicineDetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PatientCombineMedicineDetail record);

    int updateByPrimaryKey(PatientCombineMedicineDetail record);
}
