package com.WebService_Consumer.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Passenger {

	@Id
	private int passengerId;
	private String passengerName;
	private int passengerAge;
	private long passengerMobNo;
	private String passengerAddress;
	private String passengerEmailId;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Bus passengerBusDetails;
	
}
