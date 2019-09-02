package com.gyenno.ruiyun.datamigration.mapper.patient;

import com.gyenno.ruiyun.datamigration.model.patient.PatientDiseaseOrder;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
@Component
public interface PatientDiseaseOrderMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(PatientDiseaseOrder record);

    int insertSelective(PatientDiseaseOrder record);

    PatientDiseaseOrder selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PatientDiseaseOrder record);

    int updateByPrimaryKey(PatientDiseaseOrder record);
}
