package com.iiht.store.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iiht.store.entity.EGG;
import com.iiht.store.repository.EggRepository;

@Service
public class StoreService {
	
	@Autowired
	EggRepository egg;
	
	public EGG create(EGG e1) {
		return egg.save(e1);
	}

}
