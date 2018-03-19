package com.demo.transport.railway;

import java.util.List;

import com.demo.factory.CoolFactory;
import com.demo.logistic.DeliveryService;
import com.demo.product.api.Product;

public class RailwayDeliveryService implements DeliveryService
{
  private static String ALLOWED_SIZE = "MEDIUM";

  public RailwayDeliveryService()
  {
    System.out.println("rail constructor");
  }

  @Override
  public List<Product> deliverProducts()
  {
    return CoolFactory.getProductBySize(ALLOWED_SIZE);
  }
}
