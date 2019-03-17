package com.perye.manage.service;

import com.perye.manage.bean.domain.User;

/**
 * @Author: Perye
 * @Date: 2019-03-17
 */
public interface AggregationService {


	/**
	 * {@link com.perye.config.TransactionalConfig#DEFAULT_REQUIRED_METHOD_RULE_TRANSACTION_ATTRIBUTES}
	 * 这里是受到事务管理的
	 */
	void saveUser( User user );

	/**
	 * 这里没有受到事务管理的,除非配置了into*的规则
	 */
	void intoUser( User user );

}
