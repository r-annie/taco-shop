package tacos.service;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;
import tacos.data.OrderRepository;

@Service
public class OrderAdminService {
    private final OrderRepository orderRepository;

    public OrderAdminService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    //@PreAuthorize("hasRole('ADMIN')")
    public void deleteAddOrders() {
        orderRepository.deleteAll();
    }
}
