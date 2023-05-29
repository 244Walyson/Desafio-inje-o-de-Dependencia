package com.waly.desafioInjecaoDeDependencia.services;

import org.springframework.stereotype.Service;

@Service
public class DiscountService {
    public double discount(double basic, double percent){
        return ((basic*percent)/100);
    }
}
