package com.iat.bytemall.coupon.dao;

import com.iat.bytemall.coupon.entity.MemberPriceEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 * 
 * @author desmand
 * @email chris1998@qq.com
 * @date 2021-03-13 11:53:28
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPriceEntity> {
	
}
