package com.iiht.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iiht.store.entity.Milk;

@Repository
public interface MilkRepositroy extends JpaRepository<Milk, Integer>{

}
