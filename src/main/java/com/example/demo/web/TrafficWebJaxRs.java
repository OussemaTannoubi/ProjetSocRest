package com.example.demo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entities.Traffic;
import com.example.demo.repository.TrafficRepository;

import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;


@Component
@Path("/traffic")
public class TrafficWebJaxRs {
    
	@Autowired
	private TrafficRepository trafficRepo;
	
	//get list of traffic
	
	@GET
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public List<Traffic> trafficList(){
		return trafficRepo.findAll();
	}
	//get list with id
	@Path("/{id}")
	@GET
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Traffic getTraffic(@PathParam("id") Long id){
		return trafficRepo.findById(id).orElseThrow();
	}
	
	//get traffic by location
	@Path("/traficbyloc/{gouv}")
	@GET
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Traffic getTraffic(@PathParam("gouv") String gouv){
		return trafficRepo.findByGouv(gouv);
	}
	
	//create traffic
	@Path("/create")
	@POST
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Traffic trafficCreate(Traffic traffic){
		return trafficRepo.save(traffic);
	}
	
	//update traffic
	@Path("/update/{id}")
	@PUT
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Traffic trafficUpdate(Traffic traffic,@PathParam("id") Long id){
		traffic.setId(id);
		return trafficRepo.save(traffic);
	}
	
	//delete traffic
	@Path("/delete/{id}")
	@DELETE
	@Produces({MediaType.APPLICATION_JSON})
	public void trafficDelete(@PathParam("id") Long id){
		
	 trafficRepo.deleteById(id);
	}
	
	
}
