package com.waly.desafioInjecaoDeDependencia.services;

import com.waly.desafioInjecaoDeDependencia.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private ShippingService shippingService;
    @Autowired
    private DiscountService discountService;

    public OrderService(ShippingService shippingService, DiscountService discountService) {
        this.shippingService = shippingService;
        this.discountService = discountService;
    }
    public double orderService(Order order){
        return (order.getBasic() - discountService.discount(order.getBasic(),order.getDiscount())) + shippingService.shipping(order.getBasic());
    }
}
