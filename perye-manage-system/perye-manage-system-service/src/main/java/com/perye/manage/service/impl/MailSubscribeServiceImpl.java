package com.perye.manage.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.perye.common.PagingRequest;
import com.perye.manage.bean.domain.MailSubscribe;
import com.perye.manage.mapper.MailSubscribeMapper;
import com.perye.manage.service.MailSubscribeService;
import org.springframework.stereotype.Service;


/**
 * <p>
 * 邮件订阅 服务实现类
 * </p>
 *
 * @Author: Perye
 * @Date: 2019-03-17
 */
@Service
public class MailSubscribeServiceImpl extends ServiceImpl< MailSubscribeMapper, MailSubscribe > implements MailSubscribeService {

    @Override
    public PageInfo< MailSubscribe > listPage ( PagingRequest pagingRequest ) {
        PageHelper.startPage( pagingRequest.getPageNumber() , pagingRequest.getPageSize() );
        return new PageInfo<>( super.list() );
    }


}
