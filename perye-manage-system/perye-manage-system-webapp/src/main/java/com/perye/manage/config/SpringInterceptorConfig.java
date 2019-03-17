package com.perye.manage.config;

import com.perye.manage.permission.AdminPermissionInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author: Perye
 * @Date: 2019-03-17
 */
@Configuration
public class SpringInterceptorConfig implements WebMvcConfigurer {

    @Bean
    public AdminPermissionInterceptor adminPermissionInterceptor () {
        return new AdminPermissionInterceptor();
    }

    /**
     * 添加拦截器
     *
     * @param registry
     */
    @Override
    public void addInterceptors ( InterceptorRegistry registry ) {
        registry.addInterceptor( adminPermissionInterceptor() ).addPathPatterns( "/**" );
    }


}
