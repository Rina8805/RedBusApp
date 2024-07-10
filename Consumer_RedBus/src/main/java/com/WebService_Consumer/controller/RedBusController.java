package com.WebService_Consumer.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.WebService_Consumer.model.Bus;
import com.WebService_Consumer.model.Passenger;
import com.WebService_Consumer.service.PassengerService;

@RestController
public class RedBusController {

	@Autowired
	RestTemplate rsTemplate;
	
	@Autowired private PassengerService psi;
	
	@GetMapping("/getRedBusData")
	public List<List<Bus>> getConData()
	{
		// Data of Purple Bus
		String urlpurple = "http://localhost:7071/getpdata";
		List<Bus> listpurple = rsTemplate.getForObject(urlpurple, List.class);
		// Data of Valvo Bus
		String urlvalvo = "http://localhost:7072/getvdata";
		List<Bus> listvalvo = rsTemplate.getForObject(urlvalvo, List.class);
		// Data of VRL Bus
		String urlvrl = "http://localhost:7073/getvdata";
		List<Bus> listvrl = rsTemplate.getForObject(urlvrl, List.class);
		
		List<List<Bus>> allData = new ArrayList();
		allData.add(listpurple);
		allData.add(listvalvo);
		allData.add(listvrl);
		
       allData.stream().forEach(o->{System.out.println(o);});
		 return allData;
	//	return allData.stream().flatMap(a->((Collection) a).stream()).toList();
	}
	
	@GetMapping("/getRedBusData/{date}")
	public List<List> getConDataByDate(@PathVariable String date)
	{
		// Data of Purple Bus
		String urlpurple = "http://localhost:7071/getpdata/"+date;
		List<Bus> listpurple = rsTemplate.getForObject(urlpurple, List.class);
		// Data of Valvo Bus
		String urlvalvo = "http://localhost:7072/getvdata/"+date;
		List<Bus> listvalvo = rsTemplate.getForObject(urlvalvo, List.class);
		// Data of VRL Bus
		String urlvrl = "http://localhost:7073/getvdata/"+date;
		List<Bus> listvrl = rsTemplate.getForObject(urlvrl, List.class);
		
		List<List> allData = new ArrayList();
		allData.add(listpurple);
		allData.add(listvalvo);
		allData.add(listvrl);
		
		allData.stream().forEach(o->{System.out.println(o);});
//		allData.forEach(t->t.forEach(tvl->{System.out.println(tvl);}));
//		return allData;
		return allData.stream().flatMap(a->((Collection) a).stream()).toList();
	}
	
	@GetMapping("/getRedBusDataByPrice/{tprice}")
	public List<List<Bus>> getConDataByPrice(@PathVariable String tprice)
	{
		// Data of Purple Bus
		String urlpurple = "http://localhost:7071/getpdataByPrice/"+tprice;
		List<Bus> listpurple = rsTemplate.getForObject(urlpurple, List.class);
		// Data of Valvo Bus
		String urlvalvo = "http://localhost:7072/getvdataByPrice/"+tprice;
		List<Bus> listvalvo = rsTemplate.getForObject(urlvalvo, List.class);
		// Data of VRL Bus
		String urlvrl = "http://localhost:7073/getvdataByPrice/"+tprice;
		List<Bus> listvrl = rsTemplate.getForObject(urlvrl, List.class);
		
		List<List<Bus>> allData = new ArrayList();
		allData.add(listpurple);
		allData.add(listvalvo);
		allData.add(listvrl);
		allData.stream().forEach(o->{System.out.println(o);});	
		
		return allData.stream().flatMap(a->((Collection) a).stream()).toList();
	}

	@GetMapping("/getConDataByPriceAsc/{tprice}")
	public List<List<Bus>> getRedBusDataByPriceAsc(@PathVariable String tprice)
	{
		// Data of Purple Bus
		String urlpurple = "http://localhost:7071/getpdataByPriceAsc/"+tprice;
		List<Bus> listpurple = rsTemplate.getForObject(urlpurple, List.class);
		// Data of Valvo Bus
		String urlvalvo = "http://localhost:7072/getvdataByPriceAsc/"+tprice;
		List<Bus> listvalvo = rsTemplate.getForObject(urlvalvo, List.class);
		// Data of VRL Bus
		String urlvrl = "http://localhost:7073/getvdataByPriceAsc/"+tprice;
		List<Bus> listvrl = rsTemplate.getForObject(urlvrl, List.class);
		
		List<List<Bus>> allData = new ArrayList();
		allData.add(listpurple);
		allData.add(listvalvo);
		allData.add(listvrl);
		allData.stream().forEach(o->{System.out.println(o);});	
//		with stream API we can write all function in one line and implement it in one line.
		return allData.stream().flatMap(a->((Collection) a).stream()).toList();
	}
	
	@GetMapping("/getRedBusDataByPriceDesc/{tprice}")
	public List<List<Bus>> getRedBusDataByPriceDesc(@PathVariable String tprice)
	{
		// Data of Purple Bus
		String urlpurple = "http://localhost:7071/getpdataByPriceDesc/"+tprice;
		List<Bus> listpurple = rsTemplate.getForObject(urlpurple, List.class);
		// Data of Valvo Bus
		String urlvalvo = "http://localhost:7072/getvdataByPriceDesc/"+tprice;
		List<Bus> listvalvo = rsTemplate.getForObject(urlvalvo, List.class);
		// Data of VRL Bus
		String urlvrl = "http://localhost:7073/getvdataByPriceDesc/"+tprice;
		List<Bus> listvrl = rsTemplate.getForObject(urlvrl, List.class);
		
		List<List<Bus>> allData = new ArrayList();
		allData.add(listpurple);
		allData.add(listvalvo);
		allData.add(listvrl);
		
		allData.stream().forEach(o->{System.out.println(o);});
		return allData.stream().flatMap(a->((Collection) a).stream()).toList();
	}
	
	@GetMapping("/getRedBusDataByTime/{time}")
	public List<List<Bus>> getConDataByTime(@PathVariable String time)
	{
		// Data of Purple Bus
		String urlpurple = "http://localhost:7071/getpdataByTime/"+time;
		List<Bus> listpurple = rsTemplate.getForObject(urlpurple, List.class);
		// Data of Valvo Bus
		String urlvalvo = "http://localhost:7072/getvdataByTime/"+time;
		List<Bus> listvalvo = rsTemplate.getForObject(urlvalvo, List.class);
		// Data of VRL Bus
		String urlvrl = "http://localhost:7073/getvdataByTime/"+time;
		List<Bus> listvrl = rsTemplate.getForObject(urlvrl, List.class);
		
		List<List<Bus>> allData = new ArrayList();
		allData.add(listpurple);
		allData.add(listvalvo);
		allData.add(listvrl);
		allData.stream().forEach(o->{System.out.println(o);});
		
		return allData.stream().flatMap(a->((Collection) a).stream()).toList();
	}
	
	@GetMapping("/getRedBusDataByTime/{fromlocation}/{tolocation}")
	public List<List<Bus>> getConDataFromTo(@PathVariable String fromlocation,@PathVariable String tolocation)
	{
		// Data of Purple Bus
		String urlpurple = "http://localhost:7071/getpdataFromTo/"+fromlocation+"/"+tolocation;
		List<Bus> listpurple = rsTemplate.getForObject(urlpurple, List.class);
		// Data of Valvo Bus
		String urlvalvo = "http://localhost:7072/getvdataFromTo/"+fromlocation+"/"+tolocation;
		List<Bus> listvalvo = rsTemplate.getForObject(urlvalvo, List.class);
		// Data of VRL Bus
		String urlvrl = "http://localhost:7073/getvdataFromTo/"+fromlocation+"/"+tolocation;
		List<Bus> listvrl = rsTemplate.getForObject(urlvrl, List.class);
		
		List<List<Bus>> allData = new ArrayList();
		allData.add(listpurple);
		allData.add(listvalvo);
		allData.add(listvrl);
		allData.stream().forEach(o->{System.out.println(o);});
		
		return allData.stream().flatMap(a->((Collection) a).stream()).toList();
	}
	
	@GetMapping("/getRedBusDataByFrom/{fromlocation}")
	public List<List<Bus>> getConDataFrom(@PathVariable String fromlocation)
	{
		// Data of Purple Bus
		String urlpurple = "http://localhost:7071/getpdataByFrom/"+fromlocation;
		List<Bus> listpurple = rsTemplate.getForObject(urlpurple, List.class);
		// Data of Valvo Bus
		String urlvalvo = "http://localhost:7072/getvdataByFrom/"+fromlocation;
		List<Bus> listvalvo = rsTemplate.getForObject(urlvalvo, List.class);
		// Data of VRL Bus
		String urlvrl = "http://localhost:7073/getvdataByFrom/"+fromlocation;
		List<Bus> listvrl = rsTemplate.getForObject(urlvrl, List.class);
				
		List<List<Bus>> allData = new ArrayList();
		allData.add(listpurple);
		allData.add(listvalvo);
		allData.add(listvrl);
		allData.stream().forEach(o->{System.out.println(o);});
		
		return allData.stream().flatMap(a->((Collection) a).stream()).toList();
	}
	
	@GetMapping("/getRedBusDataByTo/{tolocation}")
	public List<List<Bus>> getConDataTo(@PathVariable String tolocation)
	{
		// Data of Purple Bus
		String urlpurple = "http://localhost:7071/getpdataByTo/"+tolocation;
		List<Bus> listpurple = rsTemplate.getForObject(urlpurple, List.class);
		// Data of Valvo Bus
		String urlvalvo = "http://localhost:7072/getvdataByTo/"+tolocation;
		List<Bus> listvalvo = rsTemplate.getForObject(urlvalvo, List.class);
		// Data of VRL Bus
		String urlvrl = "http://localhost:7073/getvdataByTo	/"+tolocation;
		List<Bus> listvrl = rsTemplate.getForObject(urlvrl, List.class);
						
		List<List<Bus>> allData = new ArrayList();
		allData.add(listpurple);
		allData.add(listvalvo);
		allData.add(listvrl);
		allData.stream().forEach(o->{System.out.println(o);});	
		
		return allData.stream().flatMap(a->((Collection) a).stream()).toList();
		
	}
	
	
	@PostMapping("/savePassenger")
	public Passenger savePassenger(@RequestBody Passenger p)
	{
		Passenger ps = psi.savePassenger(p);
		return ps;
	}
	
	@GetMapping("/getPassengerDatails")
	public ResponseEntity<List<Passenger>> getAllPassengerData()
	{
	    List<Passenger> st = psi.getAllPassengerData();
		return new ResponseEntity<List<Passenger>> (st,HttpStatus.OK);
	    	
	}
	
	@GetMapping("/getPassengerById/{passengerId}")
	public void getPassengerById(@PathVariable int passengerId)
	{
		psi.getPassengerById(passengerId);
	}
	
	
}
