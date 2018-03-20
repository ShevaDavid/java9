package com.demo.client.wholesale;

import java.util.ArrayList;
import java.util.List;

import com.demo.product.api.Product;

public class Client
{
  private String name;

  private List<Product> products;

  public Client(String name)
  {
    this.name = name;
    this.products = new ArrayList<>();
  }

  public void addProduct(Product product)
  {
    this.products.add(product);
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public List<Product> getProducts()
  {
    return products;
  }

  public void setProducts(List<Product> products)
  {
    this.products = products;
  }
}
