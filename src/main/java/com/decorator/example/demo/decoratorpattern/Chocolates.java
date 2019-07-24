package com.decorator.example.demo.decoratorpattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component ("chocolates")
public class Chocolates implements IBouquet {

    @Autowired
    Roses roses;

    @Override
    public String deliverFlowers() {
        return (roses.deliverFlowers() + " and add chocolates");
    }
}
