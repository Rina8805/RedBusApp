package com.WebService_ValvoBus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.WebService_ValvoBus.model.Bus;
import com.WebService_ValvoBus.service.ValvoBusService;

@RestController
public class ValvoBusController {

	@Autowired private ValvoBusService vService;
	
	@PostMapping("/savevdata")
	public Bus savePData(@RequestBody Bus b)
	{
		return vService.saveStudents(b);
	}
	
	@GetMapping("/getvdata")
	public ResponseEntity<List<Bus>> getAllVData()
	{
	    List<Bus> st = vService.getAllVData();
		return new ResponseEntity<List<Bus>> (st,HttpStatus.OK);
	    	
	}
	
	@GetMapping("/getvdata/{date}")
	public List getDataByDate(@PathVariable String date)
	{
		List lt = vService.getDataByDate(date);
		return lt;
	}
	
	@GetMapping("/getvdataByPrice/{tprice}")
	public List getDataByPrice(@PathVariable String tprice)
	{
		List lt = vService.getDataByPrice(tprice);
		return lt;
	}
	
	@GetMapping("/getvdataByPriceAsc/{tprice}")
	public List getDataByPriceAsc(@PathVariable String tprice)
	{
		List lt = vService.getDataByPriceAsc(tprice);
		return lt;
	}
	
	@GetMapping("/getvdataByPriceDesc/{tprice}")
	public List getDataByPriceDesc(@PathVariable String tprice)
	{
		List lt = vService.getDataByPriceDesc(tprice);
		return lt;
	}
	
	@GetMapping("/getvdataByTime/{time}")
	public List getDataByTime(@PathVariable String time)
	{
		List lt = vService.getDataByTime(time);
		return lt;
	}
	
	@GetMapping("getvdataByFrom/{fromlocation}")
	public List getDataByFromlocation(@PathVariable String fromlocation)
	{
		List lt = vService.getDataByFromlocation(fromlocation);
		return lt;
	}
	
	@GetMapping("getvdataByTo/{tolocation}")
	public List getDataByTolocation(@PathVariable String tolocation)
	{
		List lt = vService.getDataByTolocation(tolocation);
		return lt;
	}
	
    @GetMapping("/getvdataFromTo/{fromlocation}/{tolocation}")
    public List getDataByFromTo(@PathVariable String fromlocation,@PathVariable String tolocation)
    {
    	List lt = vService.getDataByFromTo(fromlocation,tolocation);
    	return lt;
    }
    
	
}
