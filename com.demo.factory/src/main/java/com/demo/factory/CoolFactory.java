package com.demo.factory;

import static com.demo.product.api.Product.BIG;
import static com.demo.product.api.Product.MEDIUM;
import static com.demo.product.api.Product.SMALL;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import com.demo.product.api.Product;
import com.demo.product.laptop.Laptop;
import com.demo.product.phone.Phone;

public class CoolFactory
{
  private static List<Product> products = new ArrayList<>();
  static
  {
    products.add(new Laptop("Asus k50", MEDIUM));
    products.add(new Laptop("HP 123", MEDIUM));
    products.add(new Phone("Samsung s5", SMALL));
    products.add(new Phone("Tesla Model S", BIG));
    products.add(new Phone("iPhone", SMALL));
  }

  public static List<Product> getAllProducts()
  {
    return products;
  }

  public static void createProduct(Product product)
  {
    products.add(product);
  }

  public static List<Product> getProductBySize(String size)
  {
    List<Product> filtered = new ArrayList<>();
    ListIterator<Product> iterator = products.listIterator();
    while (iterator.hasNext())
    {
      Product next = iterator.next();
      if (next.getSize().equals(size))
      {
        filtered.add(next);
        iterator.remove();
      }
    }
    return filtered;
  }

}
