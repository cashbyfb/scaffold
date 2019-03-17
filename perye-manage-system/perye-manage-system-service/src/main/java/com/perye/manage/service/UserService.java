package com.perye.manage.service;

import com.perye.common.PagingRequest;
import com.perye.manage.bean.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;

import java.util.concurrent.Future;

/**
 * <p>
 * 后台管理用户 服务类
 * </p>
 *
 * @Author: Perye
 * @Date: 2019-03-17
 */
public interface UserService extends IService< User > {

	PageInfo<User> listPage( PagingRequest pagingRequest );

	User get ( Long id );

	User update ( User user );

	boolean save ( User user );

	boolean delete ( Long id );

	User findByUsername ( String username );

	boolean isExist ( Long userId );

	boolean isNotExist ( Long userId );


	Future<Boolean> pay ();


}
