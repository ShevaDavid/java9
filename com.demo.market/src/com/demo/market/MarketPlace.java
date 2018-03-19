package com.demo.market;

import java.lang.reflect.Field;
import java.util.List;

import com.demo.client.wholesale.Client;
import com.demo.market.collector.ProductsCollector;
import com.demo.product.api.Product;
//import com.demo.transport.air.AirDeliveryService;

public class MarketPlace
{
  public static void main(String[] args) throws Exception
  {

//    Class clazz = Class.forName("com.demo.transport.air.AirDeliveryService");
//    Field allowed_size = clazz.getDeclaredField("ALLOWED_SIZE");
//    allowed_size.setAccessible(true);
//    allowed_size.set(AirDeliveryService.class, "");

    Client client = new Client("new client");
    System.out.println(client.getName());
    List<Product> collect = ProductsCollector.getAllDeliveredProducts();
    collect.forEach(product -> System.out.println(product.getModel()));
    Product product = collect.get(0);
    System.out.println(product.getModel());
    Class cls = Class.forName("com.demo.product.laptop.Laptop");
    Field model = cls.getDeclaredField("model");
    model.setAccessible(true);
    model.set(product, "Reflection name");
    System.out.println(product.getModel());

  }


}

