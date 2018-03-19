module com.demo.transport.sea {
  requires com.demo.logistic;
  requires com.demo.factory;
  provides com.demo.logistic.DeliveryService
          with com.demo.transport.sea.SeaDeliveryService;
}