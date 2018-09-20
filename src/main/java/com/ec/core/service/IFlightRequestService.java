package com.ec.core.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ec.core.entity.FlightRequest;

@Component
public interface IFlightRequestService {

	FlightRequest saveFlightRequest(FlightRequest flightRequest);
	
	public List<FlightRequest> getFlightRequestByStatus(String status);
	
}
