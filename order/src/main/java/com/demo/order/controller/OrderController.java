/*
 * Copyright 2022-2024 www.marriott.com
 */
package com.demo.order.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.demo.common.base.ApiResult;
import com.demo.order.configuration.DemoConfig;
import com.demo.order.feign.ProductFeignService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author philip li
 * @date 2024/9/2 - 10:56
 */
@RestController
public class OrderController {

  @Resource
  DemoConfig demoConfig;

  @Resource
  ProductFeignService productFeignService;

  @GetMapping("/v1/test/config")
  ApiResult<String> test(){
    return productFeignService.getProductSku();
  }

}