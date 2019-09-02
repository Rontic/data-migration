package com.gyenno.ruiyun.datamigration.model.patient;

import lombok.Data;

@Data
public class PatientFieldDetail {
    private Integer id;

    private Integer rowFieldId;

    private Integer columnFieldId;

    private String fieldValue;

    private String typeGroupCode;

    private String typeCode;

    private String typePcode;

    private Integer businessId;
}
