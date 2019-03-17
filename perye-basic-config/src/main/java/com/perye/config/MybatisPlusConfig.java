package com.perye.config;

import com.baomidou.mybatisplus.extension.injector.LogicSqlInjector;
import com.baomidou.mybatisplus.extension.plugins.PerformanceInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: Perye
 * @Date: 2019-03-16
 */
@Configuration
@ConditionalOnExpression( "${perye.mybatis-plus.enabled:true}" )
public class MybatisPlusConfig {


	/**
	 * mybatis-plus 性能分析拦截器<br>
	 * 文档：http://mp.baomidou.com<br>
	 */
	@Bean
	@ConditionalOnExpression( "${perye.mybatis-plus.performance-interceptor.enabled:false}" )
	public PerformanceInterceptor performanceInterceptor () {
		return new PerformanceInterceptor();
	}


	@Bean
	public LogicSqlInjector logicSqlInjector () {
		return new LogicSqlInjector();
	}



	@MapperScan( { "com.perye.manage.mapper" } )
	@Configuration
	public class MybatisPlusMapperScan {
	}


}
