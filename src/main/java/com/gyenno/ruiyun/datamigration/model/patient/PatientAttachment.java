package com.gyenno.ruiyun.datamigration.model.patient;

import lombok.Data;

import java.util.Date;

@Data
public class PatientAttachment {
    private String id;

    private String attachmenttitle;

    private String businesskey;

    private Date createdate;

    private String extend;

    private String realpath;

    private String busentityname;

    private String infotypeid;

    private String userid;

    private Long size;

    private String filename;

    private String tag;

    private Short attachmenttype;

    private Integer patientId;

    private Integer patientattachmentid;

    private byte[] attachmentcontent;

    private String note;

    private String subclassname;

    private String swfpath;
}
