package com.perye.manage.permission;

import java.lang.annotation.*;

/**
 * 放行,不需要登录,也不需要权限
 *
 * @Author: Perye
 * @Date: 2019-03-17
 */
@Target( { ElementType.METHOD , ElementType.TYPE } )
@Retention( RetentionPolicy.RUNTIME )
@Documented
public @interface Pass {
}
