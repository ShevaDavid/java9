package com.demo.transport.sea;

import java.util.List;

import com.demo.factory.CoolFactory;
import com.demo.logistic.DeliveryService;
import com.demo.product.api.Product;

public class SeaDeliveryService implements DeliveryService
{
  private static String ALLOWED_SIZE = "BIG";

  public SeaDeliveryService()
  {
    System.out.println("rail constructor");
  }

  @Override
  public List<Product> deliverProducts()
  {
    return CoolFactory.getProductBySize(ALLOWED_SIZE);
  }
}
