module com.demo.transport.railway {
  requires com.demo.logistic;
  requires com.demo.factory;

  provides com.demo.logistic.DeliveryService
          with com.demo.transport.railway.RailwayDeliveryService;
}