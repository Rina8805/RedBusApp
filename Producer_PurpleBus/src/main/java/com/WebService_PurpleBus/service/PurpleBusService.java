package com.WebService_PurpleBus.service;

import java.util.List;

import com.WebService_PurpleBus.model.Bus;

public interface PurpleBusService {

	public Bus saveStudents(Bus b);

	public List<Bus> getAllPData();

	public List getDataByDate(String date);

	public List getDataByPrice(String tprice);

	public List getDataByTime(String time);

	public List getDataByPriceAsc(String tprice);

	public List getDataByPriceDesc(String tprice);

	public List getDataByFromTo(String fromlocation, String tolocation);

	public List getDataByFromlocation(String fromlocation);

	public List getDataByTolocation(String tolocation);



	

	

}
