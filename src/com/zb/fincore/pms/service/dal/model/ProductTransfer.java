/*
 * ProductTransfer.java
 * Copyright (c) 2017, 资邦金服（上海）网络科技有限公司. All Rights Reserved 
 * 2017-11-17 13:35:02
 */
package com.zb.fincore.pms.service.dal.model;

import java.math.BigDecimal;
import java.util.Date;

public class ProductTransfer {
    /**
     * @Fields id 自增主键
     */
    private Long id;
    /**
     * @Fields productId 产品主键
     */
    private Long productId;
    /**
     * @Fields productCode 产品编码
     */
    private String productCode;
    /**
     * @Fields entrustTransferTime 委托转让有效时间（单位：天）
     */
    private Short entrustTransferTime;
    /**
     * @Fields transferLockTime 转让锁定期
     */
    private Short transferLockTime;
    /**
     * @Fields procedureFeePercent 手续费百分比
     */
    private Float procedureFeePercent;
    /**
     * @Fields lowPrincipalPercent 低限本金百分比
     */
    private Float lowPrincipalPercent;
    /**
     * @Fields lowInterestPercent 低限已产生利息百分比
     */
    private Float lowInterestPercent;
    /**
     * @Fields lowInputAmount 低限输入金额
     */
    private BigDecimal lowInputAmount;
    /**
     * @Fields highPrincipalPercent 高限本金百分比
     */
    private Float highPrincipalPercent;
    /**
     * @Fields highInterestPercent 高限已产生利息百分比
     */
    private Float highInterestPercent;
    /**
     * @Fields highInputAmount 低限输入金额
     */
    private BigDecimal highInputAmount;
    /**
     * @Fields createTime 创建时间
     */
    private Date createTime;
    /**
     * @Fields createBy 创建者
     */
    private String createBy;
    /**
     * @Fields modifyTime 最后更新时间
     */
    private Date modifyTime;
    /**
     * @Fields modifyBy 最后更新者
     */
    private String modifyBy;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode == null ? null : productCode.trim();
    }

    public Short getEntrustTransferTime() {
        return entrustTransferTime;
    }

    public void setEntrustTransferTime(Short entrustTransferTime) {
        this.entrustTransferTime = entrustTransferTime;
    }

    public Short getTransferLockTime() {
        return transferLockTime;
    }

    public void setTransferLockTime(Short transferLockTime) {
        this.transferLockTime = transferLockTime;
    }

    public Float getProcedureFeePercent() {
        return procedureFeePercent;
    }

    public void setProcedureFeePercent(Float procedureFeePercent) {
        this.procedureFeePercent = procedureFeePercent;
    }

    public Float getLowPrincipalPercent() {
        return lowPrincipalPercent;
    }

    public void setLowPrincipalPercent(Float lowPrincipalPercent) {
        this.lowPrincipalPercent = lowPrincipalPercent;
    }

    public Float getLowInterestPercent() {
        return lowInterestPercent;
    }

    public void setLowInterestPercent(Float lowInterestPercent) {
        this.lowInterestPercent = lowInterestPercent;
    }

    public BigDecimal getLowInputAmount() {
        return lowInputAmount;
    }

    public void setLowInputAmount(BigDecimal lowInputAmount) {
        this.lowInputAmount = lowInputAmount;
    }

    public Float getHighPrincipalPercent() {
        return highPrincipalPercent;
    }

    public void setHighPrincipalPercent(Float highPrincipalPercent) {
        this.highPrincipalPercent = highPrincipalPercent;
    }

    public Float getHighInterestPercent() {
        return highInterestPercent;
    }

    public void setHighInterestPercent(Float highInterestPercent) {
        this.highInterestPercent = highInterestPercent;
    }

    public BigDecimal getHighInputAmount() {
        return highInputAmount;
    }

    public void setHighInputAmount(BigDecimal highInputAmount) {
        this.highInputAmount = highInputAmount;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getModifyBy() {
        return modifyBy;
    }

    public void setModifyBy(String modifyBy) {
        this.modifyBy = modifyBy == null ? null : modifyBy.trim();
    }
}