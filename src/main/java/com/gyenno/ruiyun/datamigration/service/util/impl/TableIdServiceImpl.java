package com.gyenno.ruiyun.datamigration.service.util.impl;

import com.gyenno.ruiyun.datamigration.annotation.DataBase;
import com.gyenno.ruiyun.datamigration.mapper.util.TableIdMapper;
import com.gyenno.ruiyun.datamigration.service.util.TableIdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TableIdServiceImpl implements TableIdService {

    @Autowired
    private TableIdMapper tableIdMapper;

    @Override
    @DataBase("dbcloud")
    public Integer getTableId(String tableName) {
        return tableIdMapper.getTableId(tableName);
    }
}
