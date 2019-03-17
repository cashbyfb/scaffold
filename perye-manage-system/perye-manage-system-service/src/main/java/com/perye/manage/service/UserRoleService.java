package com.perye.manage.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;
import com.perye.manage.bean.domain.UserRole;
import com.perye.common.PagingRequest;

import java.util.List;

/**
 * <p>
 * 后台管理用户角色中间表 服务类
 * </p>
 *
 * @Author: Perye
 * @Date: 2019-03-17
 */
public interface UserRoleService extends IService<UserRole> {


    PageInfo listPage ( PagingRequest pagingRequest );


    List<UserRole> listByUserId ( Long userId );
}
