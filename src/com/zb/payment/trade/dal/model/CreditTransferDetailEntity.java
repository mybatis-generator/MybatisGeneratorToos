/*
 * CreditTransferDetailEntity.java
 * Copyright (c) 2017, 资邦金服（上海）网络科技有限公司. All Rights Reserved 
 * 2017-08-02 20:21:42
 */
package com.zb.payment.trade.dal.model;

import java.math.BigDecimal;
import java.util.Date;

public class CreditTransferDetailEntity extends CreditTransferDetailKey {
    /**
     * @Fields cifMemberId cif会员ID（承接人）
     */
    private String cifMemberId;
    /**
     * @Fields parentRefNo 主订单号
     */
    private String parentRefNo;
    /**
     * @Fields tradeAmt 交易金额
     */
    private BigDecimal tradeAmt;
    /**
     * @Fields feeType 费用类型 0:余额 1：代金券 2：手续费
     */
    private String feeType;
    /**
     * @Fields vouchersNo 券编号
     */
    private String vouchersNo;
    /**
     * @Fields frozenStatus 冻结状态 FROZEN冻结,UNFROZEN未冻结
     */
    private String frozenStatus;
    /**
     * @Fields tradeStatus 交易状态 U 初始, S 成功，F 失败，P 处理中
     */
    private String tradeStatus;
    /**
     * @Fields syncRspCode 同步通知状态
     */
    private String syncRspCode;
    /**
     * @Fields syncRspMsg 同步通知描述
     */
    private String syncRspMsg;
    /**
     * @Fields ayncRspCode 异步通知状态
     */
    private String ayncRspCode;
    /**
     * @Fields ayncRspMsg 异步通知描述
     */
    private String ayncRspMsg;
    /**
     * @Fields ayncRspTime 异步应答时间
     */
    private Date ayncRspTime;
    /**
     * @Fields ayncRefNo 异步通知流水号
     */
    private String ayncRefNo;
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

    public String getCifMemberId() {
        return cifMemberId;
    }

    public void setCifMemberId(String cifMemberId) {
        this.cifMemberId = cifMemberId == null ? null : cifMemberId.trim();
    }

    public String getParentRefNo() {
        return parentRefNo;
    }

    public void setParentRefNo(String parentRefNo) {
        this.parentRefNo = parentRefNo == null ? null : parentRefNo.trim();
    }

    public BigDecimal getTradeAmt() {
        return tradeAmt;
    }

    public void setTradeAmt(BigDecimal tradeAmt) {
        this.tradeAmt = tradeAmt;
    }

    public String getFeeType() {
        return feeType;
    }

    public void setFeeType(String feeType) {
        this.feeType = feeType == null ? null : feeType.trim();
    }

    public String getVouchersNo() {
        return vouchersNo;
    }

    public void setVouchersNo(String vouchersNo) {
        this.vouchersNo = vouchersNo == null ? null : vouchersNo.trim();
    }

    public String getFrozenStatus() {
        return frozenStatus;
    }

    public void setFrozenStatus(String frozenStatus) {
        this.frozenStatus = frozenStatus == null ? null : frozenStatus.trim();
    }

    public String getTradeStatus() {
        return tradeStatus;
    }

    public void setTradeStatus(String tradeStatus) {
        this.tradeStatus = tradeStatus == null ? null : tradeStatus.trim();
    }

    public String getSyncRspCode() {
        return syncRspCode;
    }

    public void setSyncRspCode(String syncRspCode) {
        this.syncRspCode = syncRspCode == null ? null : syncRspCode.trim();
    }

    public String getSyncRspMsg() {
        return syncRspMsg;
    }

    public void setSyncRspMsg(String syncRspMsg) {
        this.syncRspMsg = syncRspMsg == null ? null : syncRspMsg.trim();
    }

    public String getAyncRspCode() {
        return ayncRspCode;
    }

    public void setAyncRspCode(String ayncRspCode) {
        this.ayncRspCode = ayncRspCode == null ? null : ayncRspCode.trim();
    }

    public String getAyncRspMsg() {
        return ayncRspMsg;
    }

    public void setAyncRspMsg(String ayncRspMsg) {
        this.ayncRspMsg = ayncRspMsg == null ? null : ayncRspMsg.trim();
    }

    public Date getAyncRspTime() {
        return ayncRspTime;
    }

    public void setAyncRspTime(Date ayncRspTime) {
        this.ayncRspTime = ayncRspTime;
    }

    public String getAyncRefNo() {
        return ayncRefNo;
    }

    public void setAyncRefNo(String ayncRefNo) {
        this.ayncRefNo = ayncRefNo == null ? null : ayncRefNo.trim();
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