package com.waly.desafioInjecaoDeDependencia;

import com.waly.desafioInjecaoDeDependencia.entities.Order;
import com.waly.desafioInjecaoDeDependencia.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesafioInjecaoDeDependenciaApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public DesafioInjecaoDeDependenciaApplication(OrderService orderService) {
		this.orderService = orderService;
	}

	public static void main(String[] args) {
		SpringApplication.run(DesafioInjecaoDeDependenciaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Order order = new Order(1034, 150.00, 20.00);
		Order order1 = new Order(2282, 800.00, 10.00);
		Order order2 = new Order(1309, 95.90, 0.00);

		System.out.println("Codigo do Pedido: "+ order.getCode());
		System.out.println("Valor Total: " + orderService.orderService(order));

		System.out.println("Codigo do Pedido: "+ order1.getCode());
		System.out.println("Valor Total: " + orderService.orderService(order1));

		System.out.println("Codigo do Pedido: "+ order2.getCode());
		System.out.println("Valor Total: " + orderService.orderService(order2));

	}
}
