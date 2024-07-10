package com.WebService_PurpleBus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.WebService_PurpleBus.model.Bus;
import com.WebService_PurpleBus.service.PurpleBusService;

@RestController
public class PurpleBusController {

	@Autowired private PurpleBusService pService;
	
	@PostMapping("/savepdata")
	public Bus savePData(@RequestBody Bus b)
	{
		return pService.saveStudents(b);
	}
	
	@GetMapping("/getpdata")
	public ResponseEntity<List<Bus>> getAllPData()
	{
	    List<Bus> st = pService.getAllPData();
		return new ResponseEntity<List<Bus>> (st,HttpStatus.OK);
	    	
	}
	
	@GetMapping("/getpdata/{date}")
	public List getDataByDate(@PathVariable String date)
	{
		List lt = pService.getDataByDate(date);
		return lt;
	}
	
	@GetMapping("/getpdataByPrice/{tprice}")
	public List getDataByPrice(@PathVariable String tprice)
	{
		List lt = pService.getDataByPrice(tprice);
		return lt;
	}
	
	@GetMapping("/getpdataByPriceAsc/{tprice}")
	public List getDataByPriceAsc(@PathVariable String tprice)
	{
		List lt = pService.getDataByPriceAsc(tprice);
		return lt;
	}
	
	@GetMapping("/getpdataByPriceDesc/{tprice}")
	public List getDataByPriceDesc(@PathVariable String tprice)
	{
		List lt = pService.getDataByPriceDesc(tprice);
		return lt;
	}
	
	@GetMapping("/getpdataByTime/{time}")
	public List getDataByTime(@PathVariable String time)
	{
		List lt = pService.getDataByTime(time);
		return lt;
	}
	
	@GetMapping("getpdataByFrom/{fromlocation}")
	public List getDataByFromlocation(@PathVariable String fromlocation)
	{
		List lt = pService.getDataByFromlocation(fromlocation);
		return lt;
	}
	
	@GetMapping("getpdataByTo/{tolocation}")
	public List getDataByTolocation(@PathVariable String tolocation)
	{
		List lt = pService.getDataByTolocation(tolocation);
		return lt;
	}
	
    @GetMapping("/getpdataFromTo/{fromlocation}/{tolocation}")
    public List getDataByFromTo(@PathVariable String fromlocation,@PathVariable String tolocation)
    {
    	List lt = pService.getDataByFromTo(fromlocation,tolocation);
    	return lt;
    }
    
    
	 
}
