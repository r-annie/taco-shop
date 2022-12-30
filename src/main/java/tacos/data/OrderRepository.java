package tacos.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tacos.TacoOrder;

import java.util.UUID;

@Repository
public interface OrderRepository extends CrudRepository<TacoOrder, UUID> {

//    List<TacoOrder> findByDeliveryZip(String deliveryZip);
//
//    List<TacoOrder> readOrdersByDeliveryZipAndPlacedAtBetween(String deliveryZip, Date startDate, Date endDate);
//
//    List<TacoOrder> findByDeliveryToAndDeliveryCityAllIgnoresCase( String deliveryTo, String deliveryCity);
//
//    List<TacoOrder> findByDeliveryCityOrderByDeliveryTo(String city);
//
//    @Query("Order o where o.deliveryCity='Seattle'")
//    List<TacoOrder> readOrdersDeliveredInSeattle();
}
