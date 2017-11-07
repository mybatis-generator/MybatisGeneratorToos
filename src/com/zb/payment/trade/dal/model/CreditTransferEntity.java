/*
 * CreditTransferEntity.java
 * Copyright (c) 2017, 资邦金服（上海）网络科技有限公司. All Rights Reserved 
 * 2017-08-02 20:21:42
 */
package com.zb.payment.trade.dal.model;

import java.math.BigDecimal;
import java.util.Date;

public class CreditTransferEntity {
    /**
     * @Fields id 主键id
     */
    private Long id;
    /**
     * @Fields sourceId 渠道 TXS 唐小僧，YW 摇旺，MSD 马上贷
     */
    private String sourceId;
    /**
     * @Fields cifMemberId cif会员ID（承接人）
     */
    private String cifMemberId;
    /**
     * @Fields buyMemberId 渠道商户的会员id （承接人）
     */
    private String buyMemberId;
    /**
     * @Fields buyUsrCustId 汇付客户号（承接人）
     */
    private String buyUsrCustId;
    /**
     * @Fields accountNo 承接人账务系统账户号
     */
    private String accountNo;
    /**
     * @Fields refNo 订单号
     */
    private String refNo;
    /**
     * @Fields bidNo 标的编号
     */
    private String bidNo;
    /**
     * @Fields bidType 标的类型
     */
    private String bidType;
    /**
     * @Fields bidOrderNo 投标订单号
     */
    private String bidOrderNo;
    /**
     * @Fields bidOrderDate 投标订单日期 格式为 YYYYMMDD，例如：20130307 
     */
    private String bidOrderDate;
    /**
     * @Fields productType 产品类型 0：活期；1：定期
     */
    private String productType;
    /**
     * @Fields sellCifMemberId cif会员号（转让人）
     */
    private String sellCifMemberId;
    /**
     * @Fields sellMemberId 渠道商户会员ID（转让人）
     */
    private String sellMemberId;
    /**
     * @Fields sellUsrCustId 汇付客户号（转让人）
     */
    private String sellUsrCustId;
    /**
     * @Fields sellAccountNo 转让人账务系统账户号
     */
    private String sellAccountNo;
    /**
     * @Fields creditAmt 债券金额
     */
    private BigDecimal creditAmt;
    /**
     * @Fields transferAmt 转让金额
     */
    private BigDecimal transferAmt;
    /**
     * @Fields tradeStatus 交易状态 U 初始, S 成功，F 失败，P 处理中
     */
    private String tradeStatus;
    /**
     * @Fields bankReturnUrl 银行回调url
     */
    private String bankReturnUrl;
    /**
     * @Fields merchantPostUrl 商户请求url
     */
    private String merchantPostUrl;
    /**
     * @Fields pageType 页面类型，此参数只是适用于移动端，PC 端无需关注此参数
     */
    private String pageType;
    /**
     * @Fields tradeTime 交易时间，上游传
     */
    private Date tradeTime;
    /**
     * @Fields createTime 创建时间
     */
    private Date createTime;
    /**
     * @Fields createBy 
     */
    private String createBy;
    /**
     * @Fields modifyTime 修改时间
     */
    private Date modifyTime;
    /**
     * @Fields modifyBy 
     */
    private String modifyBy;
    /**
     * @Fields version 版本号
     */
    private Long version;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId == null ? null : sourceId.trim();
    }

    public String getCifMemberId() {
        return cifMemberId;
    }

    public void setCifMemberId(String cifMemberId) {
        this.cifMemberId = cifMemberId == null ? null : cifMemberId.trim();
    }

    public String getBuyMemberId() {
        return buyMemberId;
    }

    public void setBuyMemberId(String buyMemberId) {
        this.buyMemberId = buyMemberId == null ? null : buyMemberId.trim();
    }

    public String getBuyUsrCustId() {
        return buyUsrCustId;
    }

    public void setBuyUsrCustId(String buyUsrCustId) {
        this.buyUsrCustId = buyUsrCustId == null ? null : buyUsrCustId.trim();
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo == null ? null : accountNo.trim();
    }

    public String getRefNo() {
        return refNo;
    }

    public void setRefNo(String refNo) {
        this.refNo = refNo == null ? null : refNo.trim();
    }

    public String getBidNo() {
        return bidNo;
    }

    public void setBidNo(String bidNo) {
        this.bidNo = bidNo == null ? null : bidNo.trim();
    }

    public String getBidType() {
        return bidType;
    }

    public void setBidType(String bidType) {
        this.bidType = bidType == null ? null : bidType.trim();
    }

    public String getBidOrderNo() {
        return bidOrderNo;
    }

    public void setBidOrderNo(String bidOrderNo) {
        this.bidOrderNo = bidOrderNo == null ? null : bidOrderNo.trim();
    }

    public String getBidOrderDate() {
        return bidOrderDate;
    }

    public void setBidOrderDate(String bidOrderDate) {
        this.bidOrderDate = bidOrderDate == null ? null : bidOrderDate.trim();
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType == null ? null : productType.trim();
    }

    public String getSellCifMemberId() {
        return sellCifMemberId;
    }

    public void setSellCifMemberId(String sellCifMemberId) {
        this.sellCifMemberId = sellCifMemberId == null ? null : sellCifMemberId.trim();
    }

    public String getSellMemberId() {
        return sellMemberId;
    }

    public void setSellMemberId(String sellMemberId) {
        this.sellMemberId = sellMemberId == null ? null : sellMemberId.trim();
    }

    public String getSellUsrCustId() {
        return sellUsrCustId;
    }

    public void setSellUsrCustId(String sellUsrCustId) {
        this.sellUsrCustId = sellUsrCustId == null ? null : sellUsrCustId.trim();
    }

    public String getSellAccountNo() {
        return sellAccountNo;
    }

    public void setSellAccountNo(String sellAccountNo) {
        this.sellAccountNo = sellAccountNo == null ? null : sellAccountNo.trim();
    }

    public BigDecimal getCreditAmt() {
        return creditAmt;
    }

    public void setCreditAmt(BigDecimal creditAmt) {
        this.creditAmt = creditAmt;
    }

    public BigDecimal getTransferAmt() {
        return transferAmt;
    }

    public void setTransferAmt(BigDecimal transferAmt) {
        this.transferAmt = transferAmt;
    }

    public String getTradeStatus() {
        return tradeStatus;
    }

    public void setTradeStatus(String tradeStatus) {
        this.tradeStatus = tradeStatus == null ? null : tradeStatus.trim();
    }

    public String getBankReturnUrl() {
        return bankReturnUrl;
    }

    public void setBankReturnUrl(String bankReturnUrl) {
        this.bankReturnUrl = bankReturnUrl == null ? null : bankReturnUrl.trim();
    }

    public String getMerchantPostUrl() {
        return merchantPostUrl;
    }

    public void setMerchantPostUrl(String merchantPostUrl) {
        this.merchantPostUrl = merchantPostUrl == null ? null : merchantPostUrl.trim();
    }

    public String getPageType() {
        return pageType;
    }

    public void setPageType(String pageType) {
        this.pageType = pageType == null ? null : pageType.trim();
    }

    public Date getTradeTime() {
        return tradeTime;
    }

    public void setTradeTime(Date tradeTime) {
        this.tradeTime = tradeTime;
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

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }
}