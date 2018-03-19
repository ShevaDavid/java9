package com.demo.market.collector;

import java.util.List;
import java.util.ServiceLoader;
import java.util.stream.Collectors;

import com.demo.logistic.DeliveryService;
import com.demo.product.api.Product;

public class ProductsCollector
{
  private static List<Product> deliveredProducts;

  private static List<DeliveryService> getDeliveryServices()
  {
    ServiceLoader<DeliveryService> load = ServiceLoader.load(DeliveryService.class);
    return load.stream()
            .map(ServiceLoader.Provider::get)
            .collect(Collectors.toList());
  }

  public static List<Product> getAllDeliveredProducts()
  {
    return getDeliveryServices().stream()
            .flatMap(service -> service.deliverProducts().stream())
            .collect(Collectors.toList());
  }
}
