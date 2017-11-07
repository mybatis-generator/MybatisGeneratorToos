/*
 * CreditTransferDetailDAO.java
 * Copyright (c) 2017, 资邦金服（上海）网络科技有限公司. All Rights Reserved 
 * 2017-08-02 20:21:42
 */
package com.zb.payment.trade.dal.dao;

import com.zb.payment.trade.dal.model.CreditTransferDetailEntity;
import com.zb.payment.trade.dal.model.CreditTransferDetailKey;

public interface CreditTransferDetailDAO {
    /**
     * @MethodName deleteByPrimaryKey
     * @Description 
     * @param key
     * @return int
     */
    int deleteByPrimaryKey(CreditTransferDetailKey key);

    /**
     * @MethodName insert
     * @Description 
     * @param record
     * @return int
     */
    int insert(CreditTransferDetailEntity record);

    /**
     * @MethodName insertSelective
     * @Description 
     * @param record
     * @return int
     */
    int insertSelective(CreditTransferDetailEntity record);

    /**
     * @MethodName selectByPrimaryKey
     * @Description 
     * @param key
     * @return CreditTransferDetailEntity
     */
    CreditTransferDetailEntity selectByPrimaryKey(CreditTransferDetailKey key);

    /**
     * @MethodName updateByPrimaryKeySelective
     * @Description 
     * @param record
     * @return int
     */
    int updateByPrimaryKeySelective(CreditTransferDetailEntity record);

    /**
     * @MethodName updateByPrimaryKey
     * @Description 
     * @param record
     * @return int
     */
    int updateByPrimaryKey(CreditTransferDetailEntity record);
}