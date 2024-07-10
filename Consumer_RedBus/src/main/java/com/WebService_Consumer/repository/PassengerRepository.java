package com.WebService_Consumer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.WebService_Consumer.model.Passenger;

@Repository
public interface PassengerRepository extends JpaRepository<Passenger, Integer>{

	@Query(value="from Passenger where  passengerId=:passengerId")
	public void getPassengerById(int passengerId);

}
