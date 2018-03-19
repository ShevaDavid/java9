module com.demo.transport.air {
  requires com.demo.logistic;
  requires com.demo.factory;
  provides com.demo.logistic.DeliveryService
          with com.demo.transport.air.AirDeliveryService;
}