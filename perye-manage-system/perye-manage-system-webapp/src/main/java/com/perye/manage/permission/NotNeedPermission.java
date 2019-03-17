package com.perye.manage.permission;

import java.lang.annotation.*;

/**
 * 不需要权限,只需登录即可
 *
 * @Author: Perye
 * @Date: 2019-03-17
 */
@Target( { ElementType.METHOD , ElementType.TYPE } )
@Retention( RetentionPolicy.RUNTIME )
@Documented
public @interface NotNeedPermission {
}
