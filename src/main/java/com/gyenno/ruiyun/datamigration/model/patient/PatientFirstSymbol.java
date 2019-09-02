package com.gyenno.ruiyun.datamigration.model.patient;

import lombok.Data;

import java.util.Date;

@Data
public class PatientFirstSymbol {
    private Integer id;

    private Integer firstSymbolType;

    private Integer firstSymbolName;

    private Date ariseTimeLeftUp;

    private Date ariseTimeRightUp;

    private Date ariseTimeLeftDown;

    private Date ariseTimeRightDown;

    private Integer regular;

    private Integer notSportType;

    private String lastTime;

    private Date ariseTime;

    private Integer patientId;

    private String createBy;

    private Date createDate;

    private String updateBy;

    private Date updateDate;

    private String remarks;
}
