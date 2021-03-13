package com.iat.bytemall.ware.dao;

import com.iat.bytemall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author desmand
 * @email chris1998@qq.com
 * @date 2021-03-13 11:46:00
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
