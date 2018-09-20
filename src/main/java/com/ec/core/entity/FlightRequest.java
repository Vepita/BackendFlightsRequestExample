package com.ec.core.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "FLIGHT_REQUEST")
public class FlightRequest implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7086792170805233997L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "APLICANT_NAME")
	private String applicantName;
	
	@Column(name = "TRAVEL_DATE")
	private Date travelDate;

	@ManyToOne
	@JoinColumn(name = "FK_DESTINATION")
	private Destination destination;

	@Column(name = "REQUEST_DATE")
	private Date requestDate;
	
	@Column(name = "STATUS")
	private String status;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the applicantName
	 */
	public String getApplicantName() {
		return applicantName;
	}

	/**
	 * @param applicantName the applicantName to set
	 */
	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}

	/**
	 * @return the travelDate
	 */
	public Date getTravelDate() {
		return travelDate;
	}

	/**
	 * @param travelDate the travelDate to set
	 */
	public void setTravelDate(Date travelDate) {
		this.travelDate = travelDate;
	}

	/**
	 * @return the destination
	 */
	public Destination getDestination() {
		return destination;
	}

	/**
	 * @param destination the destination to set
	 */
	public void setDestination(Destination destination) {
		this.destination = destination;
	}

	/**
	 * @return the requestDate
	 */
	public Date getRequestDate() {
		return requestDate;
	}

	/**
	 * @param requestDate the requestDate to set
	 */
	public void setRequestDate(Date requestDate) {
		this.requestDate = requestDate;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

}
