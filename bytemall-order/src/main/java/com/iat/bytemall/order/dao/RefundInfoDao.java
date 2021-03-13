package com.iat.bytemall.order.dao;

import com.iat.bytemall.order.entity.RefundInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 退款信息
 * 
 * @author desmand
 * @email chris1998@qq.com
 * @date 2021-03-13 11:42:37
 */
@Mapper
public interface RefundInfoDao extends BaseMapper<RefundInfoEntity> {
	
}
