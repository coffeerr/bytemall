package com.iat.bytemall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.iat.common.utils.PageUtils;
import com.iat.bytemall.coupon.entity.HomeSubjectSpuEntity;

import java.util.Map;

/**
 * δΈι’εε
 *
 * @author desmand
 * @email chris1998@qq.com
 * @date 2021-03-13 11:53:28
 */
public interface HomeSubjectSpuService extends IService<HomeSubjectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

