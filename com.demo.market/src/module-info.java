module com.demo.market {
  requires com.demo.logistic;
  requires com.demo.client;
  requires com.demo.product;
  uses com.demo.logistic.DeliveryService;
}