/*
 * Copyright 2022-2024 www.marriott.com
 */
package com.demo.order.configuration;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

/**
 * @author philip li
 * @date 2024/9/4 - 15:18
 */
@Data
@Configuration
@RefreshScope
public class DemoConfig {
  @Value("${product.sku}")
  private String sku;

}