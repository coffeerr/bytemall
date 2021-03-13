package com.iat.bytemall.coupon.dao;

import com.iat.bytemall.coupon.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author desmand
 * @email chris1998@qq.com
 * @date 2021-03-13 10:06:01
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
