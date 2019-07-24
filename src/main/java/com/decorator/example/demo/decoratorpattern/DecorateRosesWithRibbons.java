package com.decorator.example.demo.decoratorpattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class DecorateRosesWithRibbons implements IBouquet{

    @Autowired
    @Qualifier("roses")
    IBouquet bouquet;

    @Override
    public String deliverFlowers() {
        String flowers = bouquet.deliverFlowers();
        return flowers + " With Ribbons";
    }


}
