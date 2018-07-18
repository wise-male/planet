package com.planet.project.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class BatchSignUp {
    private Long id;

    private String uuid;

    private String requestNo;

    private String productCode;

    private String batchProcessStatus;

    private String batchNotifyStatus;

    private String remark;

    private Date createTime;

    private String ip;

    private String notifyUrl;

    private Date lastModifiedTime;

    private String filePath;

    private String totalCount;

    private String executedCount;

    private String failCount;

    private String failMsg;

    private String version;

    private Integer intField;

    private String stringField;

    private BigDecimal decimalField;
}