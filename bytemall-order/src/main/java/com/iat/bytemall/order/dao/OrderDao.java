package com.iat.bytemall.order.dao;

import com.iat.bytemall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author desmand
 * @email chris1998@qq.com
 * @date 2021-03-13 11:42:38
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
