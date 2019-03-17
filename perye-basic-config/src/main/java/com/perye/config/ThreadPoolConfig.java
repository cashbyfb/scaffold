package com.perye.config;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.aop.interceptor.SimpleAsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

/**
 * 线程池配置
 *
 * @Author: Perye
 * @Date: 2019-03-16
 */
@Configuration
@EnableAsync
public class ThreadPoolConfig implements AsyncConfigurer {

	@Override
	public Executor getAsyncExecutor () {
		ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
		executor.setCorePoolSize( Runtime.getRuntime().availableProcessors() );
		executor.setMaxPoolSize( Runtime.getRuntime().availableProcessors() * 5 );
		executor.setQueueCapacity( Runtime.getRuntime().availableProcessors() * 2 );
		executor.setThreadNamePrefix( "perye-executor-" );
		executor.initialize();
		return executor;
	}

	@Override
	public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler () {
		return new SimpleAsyncUncaughtExceptionHandler();
	}
}
