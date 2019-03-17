package com.perye.common.exception;

/**
 * 资源不存在
 *
 * @Author: Perye
 * @Date: 2019-03-17
 */
public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException () {
        super();
    }

    public ResourceNotFoundException ( String message ) {
        super( message );
    }

    public ResourceNotFoundException ( String message, Throwable cause ) {
        super( message, cause );
    }

    public ResourceNotFoundException ( Throwable cause ) {
        super( cause );
    }

    protected ResourceNotFoundException ( String message,
                                          Throwable cause,
                                          boolean enableSuppression,
                                          boolean writableStackTrace ) {
        super( message, cause, enableSuppression, writableStackTrace );
    }
}
