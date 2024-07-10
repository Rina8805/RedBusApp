package com.WebService_ValvoBus.service;

import java.util.List;

import com.WebService_ValvoBus.model.Bus;

public interface ValvoBusService {

	public Bus saveStudents(Bus b);

	public List<Bus> getAllVData();

	public List getDataByDate(String date);

	public List getDataByPrice(String tprice);

	public List getDataByPriceAsc(String tprice);

	public List getDataByPriceDesc(String tprice);

//	public List getDataByTime(String time);

	public List getDataByFromTo(String fromlocation, String tolocation);

	public List getDataByTime(String time);

	public List getDataByFromlocation(String fromlocation);

	public List getDataByTolocation(String tolocation);

}
