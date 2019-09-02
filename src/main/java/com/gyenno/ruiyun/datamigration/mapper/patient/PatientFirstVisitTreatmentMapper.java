package com.gyenno.ruiyun.datamigration.mapper.patient;

import com.gyenno.ruiyun.datamigration.model.patient.PatientFirstVisitTreatment;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
@Component
public interface PatientFirstVisitTreatmentMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(PatientFirstVisitTreatment record);

    int insertSelective(PatientFirstVisitTreatment record);

    PatientFirstVisitTreatment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PatientFirstVisitTreatment record);
}
