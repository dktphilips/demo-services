/*
 * Copyright 2022-2024 www.marriott.com
 */
package com.demo.product.controller;

import com.demo.common.base.ApiResult;
import com.demo.product.config.ProductConfig;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.PostMapping;
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

  @PostMapping("/v1/product/sku")
  ApiResult<String> getProductSku(){
    return ApiResult.ok(productconfig.getSku());
  }

  @PostMapping("/v1/product/name")
  ApiResult<String> getProductName() throws InterruptedException {
    Thread.sleep(2000);
    return ApiResult.ok(productconfig.getName());
  }

  @PostMapping("/v1/product/stock")
  ApiResult<Integer> getProductStock(){
    return ApiResult.ok(productconfig.getStock());
  }

}