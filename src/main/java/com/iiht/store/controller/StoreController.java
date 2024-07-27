package com.iiht.store.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iiht.store.entity.EGG;
import com.iiht.store.service.StoreService;


@RestController
@RequestMapping("/store")
public class StoreController {
	
	@Autowired
	StoreService service;
	
	@PostMapping
	@RequestMapping(path="createEgg",
			consumes=MediaType.APPLICATION_JSON_VALUE,
			produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<EGG> createEgg(@RequestBody EGG eggreq){
		EGG e1 = service.create(eggreq);
		return new ResponseEntity<EGG>(e1, HttpStatus.CREATED);
	}

}
