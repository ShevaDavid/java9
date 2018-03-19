package com.demo.product.laptop;

import com.demo.product.api.Product;

public class Laptop implements Product
{
  private String model;
  private String size;

  public Laptop(String model, String size)
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
