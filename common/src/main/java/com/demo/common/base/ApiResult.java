/*
 * Copyright 2022-2023 www.marriott.com
 */
package com.demo.common.base;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.micrometer.common.util.StringUtils;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author philip li
 * @date 2023/4/10 - 09:42
 */
@Getter
@Setter
@Builder
@AllArgsConstructor
public class ApiResult <T>{
  /**
   * 响应码
   */
  private String code;

  /**
   * 响应消息
   */
  private String message;

  /**
   * 响应数据
   */
  private T data;

  /**
   * 响应时间
   */
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
  private Date time;

  public ApiResult() {
    time = new Date();
  }

  public static ApiResult<Boolean> result(boolean flag) {
    if (flag) {
      return ok();
    }
    return fail();
  }

  public static ApiResult<Boolean> result(ApiCode apiCode) {
    return result(apiCode, null);
  }

  public static <T> ApiResult<T> result(ApiCode apiCode, T data) {
    return result(apiCode, null, data);
  }

  public static <T> ApiResult<T> result(ApiCode apiCode, String message, T data) {
    String resultMessage = StringUtils.isNotBlank(apiCode.getMessage()) ? apiCode.getMessage() : message;
    return (ApiResult<T>) ApiResult.builder().code(apiCode.name()).message(resultMessage).data(data).time(new Date()).build();
  }

  public static ApiResult<Boolean> ok() {
    return ok(null);
  }

  public static <T> ApiResult<T> ok(T data) {
    return result(ApiCode.SUCCESS, data);
  }

  public static <T> ApiResult<T> ok(T data, String message) {

    return result(ApiCode.SUCCESS, message, data);
  }

  public static ApiResult<Map<String, Object>> okMap(String key, Object value) {
    Map<String, Object> map = new HashMap<>(1);
    map.put(key, value);
    return ok(map);
  }

  public static ApiResult<Boolean> fail(ApiCode apiCode) {
    return result(apiCode, null);
  }

  public static ApiResult<String> fail(String message) {
    return result(ApiCode.FAIL, message, null);

  }

  public static <T> ApiResult<T> fail(ApiCode apiCode, T data) {
    if (ApiCode.SUCCESS == apiCode) {
      throw new RuntimeException("失败结果状态码不能为" + ApiCode.SUCCESS.name());
    }
    return result(apiCode, data);

  }

  public static ApiResult<String> fail(String errorCode, String message) {
    ApiResult<String> result = new ApiResult<String>();
    result.setCode(errorCode);
    result.setMessage(message);
    return result;
  }

  public static ApiResult<Map<String, Object>> fail(String key, Object value) {
    Map<String, Object> map = new HashMap<>(1);
    map.put(key, value);
    return result(ApiCode.FAIL, map);
  }

  public static ApiResult<Boolean> fail() {
    return fail(ApiCode.FAIL);
  }
}