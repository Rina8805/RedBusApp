package com.WebService_PurpleBus.serviceimpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.WebService_PurpleBus.model.Bus;
import com.WebService_PurpleBus.repository.PurpleBusRepository;
import com.WebService_PurpleBus.service.PurpleBusService;
@Service
public class PurpleBusServiceImpl implements PurpleBusService{

	@Autowired private PurpleBusRepository pRepository;

	@Override
	public Bus saveStudents(Bus b) 
	{
		
		return pRepository.save(b);
	}
	
	@Override
	public List<Bus> getAllPData()
	{
		
		return pRepository.findAll();
	}

	@Override
	public List getDataByDate(String date)
	{
		List lt = pRepository.getDataByDate(date);
		return lt;
	}

	@Override
	public List getDataByPrice(String tprice)
	{
		List lt = pRepository.getDataByPrice(tprice);
		return lt;
	}

	@Override
	public List getDataByTime(String time) 
	{
		List lt = pRepository.getDataByTime(time);
		return lt;
	}

	@Override
	public List getDataByPriceAsc(String tprice)
	{
		List<Bus> asclt = pRepository.findAll();
		return asclt.stream().sorted((a,b)->(int)a.getTprice()-(int)b.getTprice()).toList();
	}

	@Override
	public List getDataByPriceDesc(String tprice) 
	{
		List<Bus> desclt = pRepository.findAll();
		return desclt.stream().sorted((a,b)->(int)b.getTprice()-(int)a.getTprice()).toList();
	}

	@Override
	public List getDataByFromTo(String fromlocation, String tolocation) 
	{
		List lt = pRepository.getDataByFromTo(fromlocation,tolocation);
		return lt;
	}

	@Override
	public List getDataByFromlocation(String fromlocation)
	{
	    List lt = pRepository.getDataByFromlocation(fromlocation);	
		return lt;
	}

	@Override
	public List getDataByTolocation(String tolocation)
	{
		List lt = pRepository.getDataByTolocation(tolocation);
		return lt;
	}



	
}
