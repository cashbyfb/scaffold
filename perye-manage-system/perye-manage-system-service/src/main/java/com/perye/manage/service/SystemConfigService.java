package com.perye.manage.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;
import com.perye.manage.bean.domain.SystemConfig;
import com.perye.common.PagingRequest;

/**
 * <p>
 * 系统配置表服务类
 * </p>
 *
 * @Author: Perye
 * @Date: 2019-03-17
 */
public interface SystemConfigService extends IService<SystemConfig> {

    PageInfo listPage ( PagingRequest pagingRequest );




}
