/*
 * ProductTransferDao.java
 * Copyright (c) 2017, 资邦金服（上海）网络科技有限公司. All Rights Reserved 
 * 2017-11-17 13:35:02
 */
package com.zb.fincore.pms.service.dal.dao;

import com.zb.fincore.pms.service.dal.model.ProductTransfer;

public interface ProductTransferDao {
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
    int insert(ProductTransfer record);

    /**
     * @MethodName insertSelective
     * @Description 
     * @param record
     * @return int
     */
    int insertSelective(ProductTransfer record);

    /**
     * @MethodName selectByPrimaryKey
     * @Description 
     * @param id
     * @return ProductTransfer
     */
    ProductTransfer selectByPrimaryKey(Long id);

    /**
     * @MethodName updateByPrimaryKeySelective
     * @Description 
     * @param record
     * @return int
     */
    int updateByPrimaryKeySelective(ProductTransfer record);

    /**
     * @MethodName updateByPrimaryKey
     * @Description 
     * @param record
     * @return int
     */
    int updateByPrimaryKey(ProductTransfer record);
}