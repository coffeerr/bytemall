package com.iat.bytemall.member.dao;

import com.iat.bytemall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author desmand
 * @email chris1998@qq.com
 * @date 2021-03-13 11:35:17
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
