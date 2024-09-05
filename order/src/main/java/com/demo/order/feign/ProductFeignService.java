/*
 * Copyright 2022-2024 www.marriott.com
 */
package com.demo.order.feign;

import com.demo.common.base.ApiResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author philip li
 * @date 2024/9/4 - 18:29
 */

@FeignClient(value="product")
public interface ProductFeignService {

  @PostMapping("/v1/product/sku")
  ApiResult<String> getProductSku();
}