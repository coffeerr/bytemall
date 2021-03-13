package com.iat.bytemall.coupon.dao;

import com.iat.bytemall.coupon.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author desmand
 * @email chris1998@qq.com
 * @date 2021-03-13 10:06:01
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
