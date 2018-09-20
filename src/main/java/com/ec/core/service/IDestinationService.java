package com.ec.core.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ec.core.entity.Destination;

@Component
public interface IDestinationService {

	List<Destination> getAllDestinations();
	
}
