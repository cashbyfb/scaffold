package com.perye.security.config;

import com.perye.security.websocket.JwtWebSocketInterceptorAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.support.ChannelInterceptor;

/**
 * @Author: Perye
 * @Date: 2019-03-17
 */
@Configuration
public class SpringWebSocketSecurityConfig {

    @Bean
    public ChannelInterceptor channelInterceptor () {
        return new JwtWebSocketInterceptorAdapter();
    }
}
