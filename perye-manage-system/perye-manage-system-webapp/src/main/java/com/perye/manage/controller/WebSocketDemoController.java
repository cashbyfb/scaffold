package com.perye.manage.controller;

import com.perye.common.ResponseEntityPro;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Perye
 * @Date: 2019-03-17
 */
@RestController
public class WebSocketDemoController {

	@MessageMapping( "/hello" )   // 接收客户端
	@SendTo( "/topic/greetings" ) // 广播消息
	public ResponseEntity< String > greeting ( String message ) {
		return ResponseEntityPro.ok( "Hello, " + message + "!" );
	}


}
