package com.ec.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ec.core.entity.FlightRequest;
import com.ec.core.repository.FlightRequestRepository;
import com.ec.core.service.IFlightRequestService;

@Service("flightRequestService")
public class FlightRequestServiceImpl implements IFlightRequestService {
	
	private final FlightRequestRepository flightRequestRepository;
	
	@Autowired
	public FlightRequestServiceImpl(FlightRequestRepository flightRequestRepository) {
		this.flightRequestRepository = flightRequestRepository;
	}

	@Override
	public FlightRequest saveFlightRequest(FlightRequest flightRequest) {
		return flightRequestRepository.save(flightRequest);
	}

	@Override
	public List<FlightRequest> getFlightRequestByStatus(String status) {
		return flightRequestRepository.findByStatus(status);
	}

	

}
