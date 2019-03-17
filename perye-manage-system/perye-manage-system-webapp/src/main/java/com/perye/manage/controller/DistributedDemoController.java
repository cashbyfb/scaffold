package com.perye.manage.controller;

import com.perye.manage.permission.Pass;
import com.perye.manage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 分布式异步业务示例
 *
 * @Author: Perye
 * @Date: 2019-03-17
 */
@Pass
@RestController
@RequestMapping( "distributed" )
public class DistributedDemoController {


	@Autowired
	private UserService userService;

	/**
	 * 支付
	 */
	@GetMapping( "pay" )
	public ResponseEntity pay () {
		// 支付处理
		userService.pay();
		return ResponseEntity.ok().body( "支付成功" );
	}



}
