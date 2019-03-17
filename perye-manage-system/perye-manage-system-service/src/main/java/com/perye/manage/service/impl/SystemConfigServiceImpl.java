package com.perye.manage.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.perye.common.PagingRequest;
import com.perye.manage.bean.domain.SystemConfig;
import com.perye.manage.mapper.SystemConfigMapper;
import com.perye.manage.service.SystemConfigService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统配置表(MYISAM引擎) 服务实现类
 * </p>
 *
 * @Author: Perye
 * @Date: 2019-03-17
 */
@Service
public class SystemConfigServiceImpl extends ServiceImpl< SystemConfigMapper, SystemConfig > implements SystemConfigService {


    @Override
    public PageInfo listPage ( PagingRequest pagingRequest ) {
        PageHelper.startPage( pagingRequest.getPageNumber() , pagingRequest.getPageSize() );
        return new PageInfo( super.list() );
    }


}
