package com.iiht.store.repository;
import org.springframework.stereotype.Repository;

import com.iiht.store.entity.EGG;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface EggRepository extends JpaRepository<EGG, Integer>{

}
