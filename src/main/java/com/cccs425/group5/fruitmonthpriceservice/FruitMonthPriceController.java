package com.cccs425.group5.fruitmonthpriceservice;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FruitMonthPriceController {
	
	@Autowired
	private FruitMonthPriceRepository repository;
	
	@Autowired
	private Environment enviroment;
	
	@GetMapping("/fruit-month-price/fruit/{fruit}/month/{month}")
	public FruitMonthPrice retrivePrice(@PathVariable String fruit, 
										@PathVariable String month) {
		/*FruitMonthPrice fruitMonthPrice = new FruitMonthPrice(1000L, fruit,month, BigDecimal.valueOf(50));*/
		
		FruitMonthPrice fruitMonthPrice = repository.findByFruitAndMonth(fruit, month);
		if(fruitMonthPrice == null) {
			throw new RuntimeException("Unable to find data for " + fruit + " in Month of " + month);
		}
  
		String port = enviroment.getProperty("local.server.port");
		fruitMonthPrice.setEnviroment(port);
		
		
		return fruitMonthPrice;
		
	}

}
