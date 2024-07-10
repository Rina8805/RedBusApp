package com.WebService_VRLBus.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.WebService_VRLBus.model.Bus;
import com.WebService_VRLBus.repository.VRLRepository;
import com.WebService_VRLBus.service.VRLService;

@Service
public class VRLServiceImpl implements VRLService{

	@Autowired private  VRLRepository vrlRepository;

	@Override
	public Bus saveData(Bus b) 
	{
	
		return vrlRepository.save(b);
	}

	@Override
	public List<Bus> getAllVData()
	{
	    List lt = vrlRepository.findAll();	
		return lt;
	}

	@Override
	public List getDataByDate(String date)
	{
		List lt = vrlRepository.getDataByDate(date);
		return lt;
	}

	@Override
	public List getDataByPrice(String tprice)
	{
		List lt = vrlRepository.getDataByPrice(tprice);
		return lt;
	}

	@Override
	public List getDataByPriceAsc(String tprice) 
	{
		List<Bus> asclt = vrlRepository.findAll();
		return asclt.stream().sorted((a,b)->(int)a.getTprice()-(int)b.getTprice()).toList();
	}

	@Override
	public List getDataByPriceDesc(String tprice)
	{
		List<Bus> desclt = vrlRepository.findAll();
		return desclt.stream().sorted((a,b)->(int)b.getTprice()-(int)a.getTprice()).toList();
	}

	@Override
	public List getDataByTime(String time)
	{
		List lt = vrlRepository.getDataByTime(time);
		return lt;
	}
	
	@Override
	public List getDataByFromlocation(String fromlocation) 
	{
		List lt = vrlRepository.getDataByFromlocation(fromlocation);
		return lt;
	}

	@Override
	public List getDataByTolocation(String tolocation)
	{
		List lt = vrlRepository.getDataByFromlocation(tolocation);
		return lt;
	}

	@Override
	public List getDataByFromTo(String fromlocation, String tolocation) 
	{
		List lt = vrlRepository.getDataByFromTo(fromlocation, tolocation);
		return lt;
	}
	
}
