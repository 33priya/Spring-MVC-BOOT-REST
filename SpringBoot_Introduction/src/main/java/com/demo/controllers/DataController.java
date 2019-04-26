package com.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.beans.SaveDate;
import com.demo.dao.SaveDateDAO;

@RestController
public class DataController {

	@Autowired
	private SaveDateDAO dao;
	
	@PostMapping("/dates")
	public SaveDate addDate(@RequestBody SaveDate saveDate) {
		return dao.save(saveDate);
	}
	
	@GetMapping("/dates")
	public List<SaveDate> getAllDate() {
		return (List<SaveDate>) dao.findAll();
	}
}
