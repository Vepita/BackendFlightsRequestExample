package com.ec.core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ec.core.entity.Destination;
import com.ec.core.entity.FlightRequest;
import com.ec.core.entity.RestResponse;
import com.ec.core.service.IDestinationService;
import com.ec.core.service.IFlightRequestService;

import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/flights")
@ApiResponses(value = { @ApiResponse(code = 200, message = "true"),
		@ApiResponse(code = 404, message = "The resource not found") })
public class FlightManagementController {

	private final IDestinationService destinationService;
	private final IFlightRequestService flightRequestService;

	@Autowired
	public FlightManagementController(IDestinationService destinationService, IFlightRequestService flightRequestService) {
		this.destinationService = destinationService;
		this.flightRequestService = flightRequestService;
	}

	@RequestMapping(value = "/getAllDestinations", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public RestResponse getAllDestinations() {
		List<Destination> destinations = null;
		try {
			destinations = destinationService.getAllDestinations();
		} catch (Exception e) {
			return new RestResponse(null, true, "Error at obtain all destinations: " + e.getMessage());
		}
		return new RestResponse(destinations, false, null);
	}

	@RequestMapping(value = "/saveFlightRequest", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
	public RestResponse saveFlightRequest(@RequestBody FlightRequest flightRequest) {
		FlightRequest flightRequestSaved;
		try {
			flightRequestSaved = this.flightRequestService.saveFlightRequest(flightRequest);
		} catch (Exception e) {
			return new RestResponse(null, true, "Error saving flightRequest: " + e.getMessage());
		}
		return new RestResponse(flightRequestSaved, false, null);
	}
	
	@RequestMapping(value = "/getFlightRequestByStatus/{status}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public RestResponse getFlightRequestByStatus(@PathVariable("status") String status) {
		List<FlightRequest> flightsRequest = null;
		try {
			flightsRequest = this.flightRequestService.getFlightRequestByStatus(status);
		} catch (Exception e) {
			return new RestResponse(null, true, "Error obtaining flight requests: " + e.getMessage());
		}
		return new RestResponse(flightsRequest, false, null);
	}

}
