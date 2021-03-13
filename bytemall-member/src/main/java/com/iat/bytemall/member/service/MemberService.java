package com.iat.bytemall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.iat.common.utils.PageUtils;
import com.iat.bytemall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author desmand
 * @email chris1998@qq.com
 * @date 2021-03-13 11:35:17
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

