package com.iat.bytemall.coupon.dao;

import com.iat.bytemall.coupon.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author desmand
 * @email chris1998@qq.com
 * @date 2021-03-13 10:06:02
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
