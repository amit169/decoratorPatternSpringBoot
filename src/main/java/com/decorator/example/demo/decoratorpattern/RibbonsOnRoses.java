package com.decorator.example.demo.decoratorpattern;

public class RibbonsOnRoses extends Roses {
    @Override
    public String deliverFlowers() {
        return super.deliverFlowers() + "and add Ribbons";
    }
}
