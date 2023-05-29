package com.waly.desafioInjecaoDeDependencia.services;

import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipping(double basic){
        if(basic < 100){
            return 20.00;
        }
        else if (basic > 100 && basic < 200){
            return 12.00;
        }
        else return 0.00;
    }
}
