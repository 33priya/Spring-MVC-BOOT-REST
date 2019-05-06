package com.boot.drools.services.impl;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.drools.models.Product;
import com.boot.drools.services.MyService;

@Service
public class MyServiceImpl implements MyService {

	@Autowired
	private KieContainer kieContainer;

	public Product getProductDiscount(Product product) {
		KieSession kieSession = kieContainer.newKieSession("rulesSession");
		kieSession.insert(product);
		kieSession.fireAllRules();
		kieSession.dispose();
		return product;
	}
}
