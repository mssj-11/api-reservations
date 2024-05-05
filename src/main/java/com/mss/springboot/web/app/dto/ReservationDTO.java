package com.mss.springboot.web.app.dto;

import java.util.List;

public class ReservationDTO {
	
	private Long id;
	private List<PassengerDTO> passengers;
	private ItineraryDTO Itinerary;
	
	
	
	//	Getter & Setter
	public List<PassengerDTO> getPassengers() {
		return passengers;
	}
	public void setPassengers(List<PassengerDTO> passengers) {
		this.passengers = passengers;
	}
	public ItineraryDTO getItinerary() {
		return Itinerary;
	}
	public void setItinerary(ItineraryDTO itinerary) {
		Itinerary = itinerary;
	}
	
	
	
	
}