package com.WebService_Consumer.serviceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.WebService_Consumer.model.Passenger;
import com.WebService_Consumer.repository.PassengerRepository;
import com.WebService_Consumer.service.PassengerService;

@Service
public class PassengerServiceImpl implements PassengerService{

	@Autowired private PassengerRepository psr;
	
	@Override
	public Passenger savePassenger(Passenger p) 
	{
		
		return psr.save(p);
	}

	@Override
	public List<Passenger> getAllPassengerData()
	{
		
		return psr.findAll();
	}

	@Override
	public void getPassengerById(int passengerId) 
	{
		psr.getPassengerById(passengerId);
		
	}

}
