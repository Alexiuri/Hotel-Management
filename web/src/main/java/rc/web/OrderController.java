package rc.web;

import org.springframework.web.bind.annotation.GetMapping;
import rc.domain.Location;
import rc.domain.Order;
import rc.persistence.LocationRepository;
import rc.persistence.OrderRepository;

import java.util.List;

public class OrderController {

    OrderRepository orderRepository;

    public OrderController(OrderRepository orderRepository){
        this.orderRepository= orderRepository;
    }

    @GetMapping("/orderes")
    public List<Order> getAll(){

        List<Order> orderList = this.orderRepository.findAll();

        return orderList;
    }
}
