/*
 * CreditTransferDetailKey.java
 * Copyright (c) 2017, 资邦金服（上海）网络科技有限公司. All Rights Reserved 
 * 2017-08-02 20:21:42
 */
package com.zb.payment.trade.dal.model;

public class CreditTransferDetailKey {
    /**
     * @Fields id 主键ID
     */
    private Long id;
    /**
     * @Fields refNo 子订单号,生成规则:parent_ref_no+"_"+i
     */
    private String refNo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRefNo() {
        return refNo;
    }

    public void setRefNo(String refNo) {
        this.refNo = refNo == null ? null : refNo.trim();
    }
}