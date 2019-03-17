package com.perye.common.exception;

/**
 * 权限
 *
 * @Author: Perye
 * @Date: 2019-03-17
 */
public class ForbiddenException extends RuntimeException {

    public ForbiddenException () {
        super();
    }

    public ForbiddenException ( String message ) {
        super( message );
    }

    public ForbiddenException ( String message, Throwable cause ) {
        super( message, cause );
    }

    public ForbiddenException ( Throwable cause ) {
        super( cause );
    }

    protected ForbiddenException ( String message,
                                   Throwable cause,
                                   boolean enableSuppression,
                                   boolean writableStackTrace ) {
        super( message, cause, enableSuppression, writableStackTrace );
    }
}
