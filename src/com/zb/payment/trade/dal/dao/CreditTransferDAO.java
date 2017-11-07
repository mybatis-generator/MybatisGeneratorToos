/*
 * CreditTransferDAO.java
 * Copyright (c) 2017, 资邦金服（上海）网络科技有限公司. All Rights Reserved 
 * 2017-08-02 20:21:42
 */
package com.zb.payment.trade.dal.dao;

import com.zb.payment.trade.dal.model.CreditTransferEntity;

public interface CreditTransferDAO {
    /**
     * @MethodName deleteByPrimaryKey
     * @Description 
     * @param id
     * @return int
     */
    int deleteByPrimaryKey(Long id);

    /**
     * @MethodName insert
     * @Description 
     * @param record
     * @return int
     */
    int insert(CreditTransferEntity record);

    /**
     * @MethodName insertSelective
     * @Description 
     * @param record
     * @return int
     */
    int insertSelective(CreditTransferEntity record);

    /**
     * @MethodName selectByPrimaryKey
     * @Description 
     * @param id
     * @return CreditTransferEntity
     */
    CreditTransferEntity selectByPrimaryKey(Long id);

    /**
     * @MethodName updateByPrimaryKeySelective
     * @Description 
     * @param record
     * @return int
     */
    int updateByPrimaryKeySelective(CreditTransferEntity record);

    /**
     * @MethodName updateByPrimaryKey
     * @Description 
     * @param record
     * @return int
     */
    int updateByPrimaryKey(CreditTransferEntity record);
}