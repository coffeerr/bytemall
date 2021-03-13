package com.iat.bytemall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.iat.common.utils.PageUtils;
import com.iat.bytemall.coupon.entity.OrderSettingEntity;

import java.util.Map;

/**
 * 订单配置信息
 *
 * @author desmand
 * @email chris1998@qq.com
 * @date 2021-03-13 10:06:01
 */
public interface OrderSettingService extends IService<OrderSettingEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

