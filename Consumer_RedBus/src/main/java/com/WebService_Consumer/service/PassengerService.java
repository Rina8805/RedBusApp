package com.WebService_Consumer.service;

import java.util.List;
import com.WebService_Consumer.model.Passenger;

public interface PassengerService {

	public Passenger savePassenger(Passenger p);

	public List<Passenger> getAllPassengerData();

	public void getPassengerById(int passengerId);

}
