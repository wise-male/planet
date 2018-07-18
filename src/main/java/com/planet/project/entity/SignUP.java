package com.planet.project.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class SignUP {
    private Long id;

    private String signUpUuid;

    private String merId;

    private String orderNumber;

    private String accName;

    private String accNo;

    private String certifId;

    private String certType;

    private String phoneNo;

    private String proNo;

    private String bankId;

    private Date proBeginDate;

    private Date proEndDate;

    private BigDecimal transMaxAmount;

    private Date orderTime;

    private String payType;

    private String transType;

    private Integer signUpStatus;

    private String bankAliasName;

    private String bankFullName;

    private String stdBankCode;

    private String remark;

    private Date modifyTime;

    private Date signTime;

    private Date cancelTime;

    private String productCode;

    private String responseMsg;

    private Integer paymentInstitution;

    private String requestNo;

    private String userId;

    private Integer cardType;

    private String reseRequestNo;

    private String msgCode;

    private String notifyUrl;

    private String batchSignUpUuid;

}