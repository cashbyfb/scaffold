package com.perye.manage.bean.vo;

import com.perye.manage.bean.domain.Role;
import com.perye.manage.bean.domain.User;
import lombok.*;
import lombok.experimental.Accessors;

/**
 * <p>
 * 后台管理用户
 * </p>
 *
 * @Author: Perye
 * @Date: 2019-03-17
 */
@Getter
@Setter
@ToString
@Accessors( chain = true )
public class UserVO extends User {

	private Role role;


}
