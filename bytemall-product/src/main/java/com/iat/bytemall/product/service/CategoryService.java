package com.iat.bytemall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.iat.common.utils.PageUtils;
import com.iat.bytemall.product.entity.CategoryEntity;

import java.util.Map;

/**
 * 商品三级分类
 *
 * @author desmand
 * @email chris1998@qq.com
 * @date 2021-03-13 10:57:19
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

