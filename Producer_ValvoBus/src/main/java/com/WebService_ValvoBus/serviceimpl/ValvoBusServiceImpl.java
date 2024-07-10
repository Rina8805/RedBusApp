package com.WebService_ValvoBus.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.WebService_ValvoBus.model.Bus;
import com.WebService_ValvoBus.repository.ValvoBusRepository;
import com.WebService_ValvoBus.service.ValvoBusService;

@Service
public class ValvoBusServiceImpl implements ValvoBusService{

	@Autowired private ValvoBusRepository vRepository;

	@Override
	public Bus saveStudents(Bus b)
	{
		return vRepository.save(b);
		 
	}

	@Override
	public List<Bus> getAllVData() {
		
		return vRepository.findAll();
	}

	@Override
	public List getDataByDate(String date)
	{
		List lt = vRepository.getDataByDate(date);
		return lt;
	}

	@Override
	public List getDataByPriceAsc(String tprice)
	{
		List<Bus> asclt = vRepository.findAll();
		return asclt.stream().sorted((a,b)->(int)a.getTprice()-(int)b.getTprice()).toList();
	}

	@Override
	public List getDataByPriceDesc(String tprice) 
	{
		List<Bus> desclt = vRepository.findAll();
		return desclt.stream().sorted((a,b)->(int)b.getTprice()-(int)a.getTprice()).toList();
	}

	@Override
	public List getDataByPrice(String tprice)
	{
		List lt = vRepository.getDataByPrice(tprice);
		return lt;
	}


	@Override
	public List getDataByFromTo(String fromlocation, String tolocation) 
	{
		List lt = vRepository.getDataByFromTo(fromlocation,tolocation);
		return lt;
	}

	@Override
	public List getDataByTime(String time) 
	{
		List lt = vRepository.getDataByTime(time);
		return lt;
	}

	@Override
	public List getDataByFromlocation(String fromlocation) 
	{
		List lt = vRepository.getDataByFromlocation(fromlocation);
		return lt;
	}

	@Override
	public List getDataByTolocation(String tolocation)
	{
		List lt = vRepository.getDataByFromlocation(tolocation);
		return lt;
	}
	
}
