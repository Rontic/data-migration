package com.gyenno.ruiyun.datamigration.mapper.util;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface TableIdMapper {
    public Integer getTableId(@Param("tableName") String tableName);
}
