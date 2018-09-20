package com.ec.core.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ec.core.entity.Destination;

@Repository
public interface DestinationRepository extends CrudRepository<Destination, Long>{
	
	public List<Destination> findByStatusTrue();	

}
