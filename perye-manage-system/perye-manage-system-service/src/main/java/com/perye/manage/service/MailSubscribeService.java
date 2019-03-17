package com.perye.manage.service;

import com.perye.common.PagingRequest;
import com.perye.manage.bean.domain.MailSubscribe;
import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;

/**
 * <p>
 * 邮件订阅 服务类
 * </p>
 *
 * @Author: Perye
 * @Date: 2019-03-17
 */
public interface MailSubscribeService extends IService<MailSubscribe> {


    PageInfo<MailSubscribe> listPage ( PagingRequest pagingRequest );

}
