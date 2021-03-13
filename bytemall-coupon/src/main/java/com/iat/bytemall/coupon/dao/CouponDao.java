package com.iat.bytemall.coupon.dao;

import com.iat.bytemall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author desmand
 * @email chris1998@qq.com
 * @date 2021-03-13 11:53:28
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
