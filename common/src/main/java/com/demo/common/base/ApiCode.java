/*
 * Copyright 2022-2023 www.marriott.com
 */
package com.demo.common.base;

/**
 * @author philip li
 * @date 2023/4/10 - 09:44
 */
public enum ApiCode {
    /**
     * 操作成功
     **/
    SUCCESS("操作成功"),
    /**
     * 操作失败
     **/
    FAIL("操作失败"),

    /**
     * HTTP_REQUEST_METHOD_NOT_SUPPORTED_EXCEPTION
     */
    HTTP_REQUEST_METHOD_NOT_SUPPORTED_EXCEPTION("METHOD NOT SUPPORTED"),

    /**
     * HTTP内容类型异常
     */
    HTTP_MEDIA_TYPE_EXCEPTION("HTTP内容类型异常"),
    /**
     * 参数异常
     */
    PARAMETER_EXCEPTION("参数异常"),
    /**
     * 业务不支持
     */
    BUSINESS_NOT_SUPPORT("业务不支持"),

    /**
     * 查询异常
     */
    QUERY_ERROR("查询异常"),

    /**
     * 系统异常
     */
    SYSTEM_ERROR("系统异常"),
    ;

    private final String message;

    ApiCode(final String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}