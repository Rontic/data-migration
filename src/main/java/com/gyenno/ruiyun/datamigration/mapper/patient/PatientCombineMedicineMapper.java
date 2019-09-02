package com.gyenno.ruiyun.datamigration.mapper.patient;

import com.gyenno.ruiyun.datamigration.model.patient.PatientCombineMedicine;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
@Component
public interface PatientCombineMedicineMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(PatientCombineMedicine record);

    int insertSelective(PatientCombineMedicine record);

    PatientCombineMedicine selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PatientCombineMedicine record);
}
