package com.gyenno.ruiyun.datamigration.model.patient;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class PatientAdverseMedicine {
    private Integer id;

    private String medicineName;

    private BigDecimal totalDailyDose;

    private Byte medicineMethod;

    private Byte medicineType;

    private Integer adverseId;
}
