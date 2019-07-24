package com.decorator.example.demo.decoratorpattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DecoratorpatternApplication implements CommandLineRunner {

	//Primary
	@Autowired
	private IBouquet bouquet;

	//Roses Component
	@Autowired
	@Qualifier("roses")
	private IBouquet bouquetr;

	//Tulips Component
	@Autowired
	@Qualifier("tulips")
	private IBouquet bouquett;

	//Chocolates Component
	@Autowired
	@Qualifier("chocolates")
	private IBouquet chocolates;


    //Chocolates with Ribbons Component
    @Autowired
    @Qualifier("choc_ribbons")
    private IBouquet choc_ribbon;

	public static void main(String[] args) {
		SpringApplication.run(DecoratorpatternApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Primary :" + bouquet.deliverFlowers());
		System.out.println("Roses Component :" + bouquetr.deliverFlowers());
		System.out.println("Tulips Component :" + bouquett.deliverFlowers());
		System.out.println("Chocolates Component :" + chocolates.deliverFlowers());
        System.out.println("Chocolates with Ribbons Component :" + choc_ribbon.deliverFlowers());

    }
}
