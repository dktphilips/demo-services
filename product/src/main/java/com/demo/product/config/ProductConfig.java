/*
 * Copyright 2022-2024 www.marriott.com
 */
package com.demo.product.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

/**
 * @author philip li
 * @date 2024/9/4 - 16:42
 */
@Configuration
@Data
@RefreshScope
public class ProductConfig {
  @Value("${product.sku}")
  private String sku;
  @Value("${product.name}")
  private String name;
  @Value("${product.stock}")
  private Integer stock;
}