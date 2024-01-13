package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Traffic;

public interface TrafficRepository extends JpaRepository<Traffic,Long>{
 
	public Traffic findByGouv(String gouv);
}
