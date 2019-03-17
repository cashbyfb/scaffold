package com.perye.common.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 字段注释
 *
 * @Author: Perye
 * @Date: 2019-03-17
 */
@Retention( RetentionPolicy.RUNTIME )
@Target( ElementType.FIELD )
public @interface FiledComment {

    /**
     * 字段释义
     */
    String value () default "";
}
