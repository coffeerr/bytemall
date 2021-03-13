package com.iat.bytemall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.iat.common.utils.PageUtils;
import com.iat.bytemall.coupon.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author desmand
 * @email chris1998@qq.com
 * @date 2021-03-13 10:06:02
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

