package com.iat.bytemall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.iat.common.utils.PageUtils;
import com.iat.bytemall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author desmand
 * @email chris1998@qq.com
 * @date 2021-03-13 11:42:38
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

