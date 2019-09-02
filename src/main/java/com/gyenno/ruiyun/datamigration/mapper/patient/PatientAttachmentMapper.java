package com.gyenno.ruiyun.datamigration.mapper.patient;

import com.gyenno.ruiyun.datamigration.model.patient.PatientAttachment;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
@Component
public interface PatientAttachmentMapper {

    int deleteByPrimaryKey(String id);

    int insert(PatientAttachment record);

    int insertSelective(PatientAttachment record);

    PatientAttachment selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(PatientAttachment record);
}
