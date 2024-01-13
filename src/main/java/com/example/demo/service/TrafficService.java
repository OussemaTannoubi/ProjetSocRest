package com.example.demo.service;

import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entities.Traffic;
import com.example.demo.repository.TrafficRepository;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Service
@NoArgsConstructor
@AllArgsConstructor
public class TrafficService {
  

	private TrafficRepository trafficRepo;
	
	
	public Traffic createTraffic(Traffic traffic) {
		return trafficRepo.save(traffic);
	}
}
