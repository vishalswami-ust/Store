package com.iiht.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iiht.store.entity.Chocolate;

@Repository
public interface ChocolateRespository extends JpaRepository<Chocolate, Integer> {

}
