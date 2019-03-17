package com.perye.common.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 导出释义
 *
 * @Author: Perye
 * @Date: 2019-03-17
 */
@Retention( RetentionPolicy.RUNTIME )
@Target( ElementType.FIELD )
public @interface ExportFiledComment {

    /**
     * 字段释义
     */
    String value () default "";
}
