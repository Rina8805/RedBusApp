package com.WebService_VRLBus.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.WebService_VRLBus.model.Bus;

@Repository
public interface VRLRepository extends JpaRepository<Bus, Integer>{

	@Query(value="from Bus where date=:date")
	public List getDataByDate(String date);

	@Query(value="from Bus where tprice=:tprice")
	public List getDataByPrice(String tprice);

	@Query(value="from Bus where time=:time")
	public List getDataByTime(String time);

	@Query(value="from Bus where fromlocation=:fromlocation and tolocation=:tolocation")
	public List getDataByFromTo(String fromlocation, String tolocation);

	@Query(value="from Bus where fromlocation=:fromlocation")
	public List getDataByFromlocation(String fromlocation);

	@Query(value="from Bus where tolocation=:tolocation")
	public List getDataByTolocation(String tolocation);
	
}
