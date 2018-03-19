package com.demo.product.phone;

import com.demo.product.api.Product;

public class Phone implements Product
{
  private String model;
  private String size;

  public Phone(String model, String size)
  {
    this.model = model;
    this.size = size;
  }

  @Override
  public String getModel()
  {
    return this.model;
  }

  @Override
  public String getSize()
  {
    return this.size;
  }
}
