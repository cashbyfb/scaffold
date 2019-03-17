package com.perye.manage.service;

import com.perye.manage.bean.domain.Role;
import com.perye.manage.bean.domain.UserRole;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 后台管理角色表 服务类
 * </p>
 *
 * @Author: Perye
 * @Date: 2019-03-17
 */
public interface RoleService extends IService< Role > {


    List< Role > listByUserId ( Long userId );

    boolean save ( Long userId , Long roleId );

    List< Role > listByUserRole ( List< UserRole > userRoles );

    boolean deleteRelatedById ( Long id );

	Role getByRoleNameCode ( String roleCode );

}
