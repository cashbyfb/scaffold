package com.perye.manage.service.impl;

import com.perye.common.util.AssertUtils;
import com.perye.manage.bean.domain.User;
import com.perye.manage.service.AggregationService;
import com.perye.manage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: Perye
 * @Date: 2019-03-17
 */
@Service
public class AggregationServiceImpl implements AggregationService {

	@Autowired
	private UserService userService;


	@Override
	public void saveUser ( User user ) {
		userService.save( user );
		AssertUtils.isTrue( true , "测试事务是否回滚(可传播),请查看数据库." );
	}

	@Override
	public void intoUser ( User user ) {
		userService.save( user );
		AssertUtils.isTrue( true , "测试事务是否回滚(可传播),请查看数据库." );
	}
}
