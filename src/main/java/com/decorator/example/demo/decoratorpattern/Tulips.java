package com.decorator.example.demo.decoratorpattern;

import org.springframework.stereotype.Component;

@Component("tulips")
public class Tulips implements IBouquet{


    @Override
    public String deliverFlowers() {
        return "Deliver Tulips";
    }

}
