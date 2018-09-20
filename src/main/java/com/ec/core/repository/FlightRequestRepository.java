package com.ec.core.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ec.core.entity.FlightRequest;

public interface FlightRequestRepository extends CrudRepository<FlightRequest, Long> {

	public List<FlightRequest> findByStatus(String status);
}
