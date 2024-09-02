/*
 * Copyright 2022-2024 www.marriott.com
 */
package com.demo.order.controller;

import com.demo.common.base.ApiResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author philipsli
 * @date 2024/9/2 - 10:56
 */
@RestController
public class OrderController {

  @GetMapping("/v1/test/config")
  ApiResult<String> test(){
    return ApiResult.ok("666");
  }

}