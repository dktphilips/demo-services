/*
 * Copyright 2022-2023 www.marriott.com
 */
package com.demo.common.base;


import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author philip li
 * @date 2023/6/1 - 10:24
 */
@Getter
@Setter

public class ApiRequest implements Serializable {
  /**
   * 租户(餐厅)编码
   */
  private String outletCode;

}