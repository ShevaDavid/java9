package com.demo.transport.air;

import java.util.List;

import com.demo.factory.CoolFactory;
import com.demo.logistic.DeliveryService;
import com.demo.product.api.Product;

public class AirDeliveryService implements DeliveryService
{
  private static String ALLOWED_SIZE = "SMALL";

  public AirDeliveryService()
  {
    System.out.println("air constructor");
  }

  @Override
  public List<Product> deliverProducts()
  {
    return CoolFactory.getProductBySize(ALLOWED_SIZE);
  }
}
