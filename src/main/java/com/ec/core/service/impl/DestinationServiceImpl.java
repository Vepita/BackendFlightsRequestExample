package com.ec.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ec.core.entity.Destination;
import com.ec.core.repository.DestinationRepository;
import com.ec.core.service.IDestinationService;

@Service("destinationService")
public class DestinationServiceImpl implements IDestinationService {
	
	private final DestinationRepository destinationRepository;
	
	@Autowired
	public DestinationServiceImpl(DestinationRepository destinationRepository) {
		this.destinationRepository = destinationRepository;
	}

	@Override
	public List<Destination> getAllDestinations() {
		return destinationRepository.findByStatusTrue();
	}

}
