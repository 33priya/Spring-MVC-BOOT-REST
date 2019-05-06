package com.boot.drools.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.boot.drools.models.Product;
import com.boot.drools.services.MyService;

@RestController
public class MyController {

	@Autowired
	private MyService service;

	@RequestMapping(value = "/discount", method = RequestMethod.GET, produces = "application/json")
	public Product getQuestions(@RequestParam(required = true) String type) {

		Product product = new Product();
		product.setType(type);

		service.getProductDiscount(product);

		return product;
	}
}
