package com.gyenno.ruiyun.datamigration.model.patient;

import lombok.Data;

import java.util.Date;

@Data
public class PatientMedicineAdverseMd {
    private Integer id;

    private String medicineName;

    private String number;

    private String useMedicineWay;

    private Byte whetherContinue;

    private Date duration;

    private Integer medicineAdverseId;
}
