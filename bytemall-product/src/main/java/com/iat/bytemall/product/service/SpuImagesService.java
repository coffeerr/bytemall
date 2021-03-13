package com.iat.bytemall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.iat.common.utils.PageUtils;
import com.iat.bytemall.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author desmand
 * @email chris1998@qq.com
 * @date 2021-03-13 10:57:19
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

