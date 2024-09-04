/*
 * Copyright 2022-2024 www.marriott.com
 */
package com.demo.product.controller;

import com.demo.common.base.ApiResult;
import com.demo.product.config.ProductConfig;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author philipsli
 * @date 2024/9/4 - 17:09
 */
@RestController
public class ProductController {

  @Resource
  ProductConfig productconfig;

  @RequestMapping("/v1/product")
  ApiResult<String> getProductInfo(){
    return ApiResult.ok(productconfig.getSku());
  }
}