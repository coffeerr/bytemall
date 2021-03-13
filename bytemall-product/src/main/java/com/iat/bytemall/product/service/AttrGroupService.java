package com.iat.bytemall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.iat.common.utils.PageUtils;
import com.iat.bytemall.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author desmand
 * @email chris1998@qq.com
 * @date 2021-03-13 10:57:19
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

