package com.decorator.example.demo.decoratorpattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("choc_ribbons")
public class ChocolateswithRibbons implements IBouquet {

    @Autowired
    DecorateRosesWithRibbons decorateRosesWithRibbons;

    @Override
    public String deliverFlowers() {
        return (decorateRosesWithRibbons.deliverFlowers() + " add chocolates");
    }
}
