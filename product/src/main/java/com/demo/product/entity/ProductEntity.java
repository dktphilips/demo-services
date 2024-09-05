/*
 * Copyright 2022-2024 www.marriott.com
 */
package com.demo.product.entity;

import lombok.Data;

/**
 * @author philip li
 * @date 2024/9/4 - 18:16
 */
@Data
public class ProductEntity {

  private String sku;

  private String name;

  private Integer stock;

}