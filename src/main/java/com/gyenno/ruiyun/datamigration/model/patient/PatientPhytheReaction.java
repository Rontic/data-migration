package com.gyenno.ruiyun.datamigration.model.patient;

import lombok.Data;

@Data
public class PatientPhytheReaction {
    private Integer id;

    private Integer reactionType;

    private Integer severityLevel;

    private Integer assessType;

    private Integer assessId;
}
