package com.boot.req.res.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailResource {
	
	@PostMapping(value="/bookTicket",produces= {"application/xml",
			"application/json"},
	consumes= {"application/xml",
			"application/json"})
	
	public ResponseEntity<TicketDto> bookTicket(@RequestBody PassengerInfo pinfo) {
		
		System.out.println(pinfo);
		System.out.println(pinfo.getFirstName());
		
		Ticket t = new Ticket();
		t.setTicketId("TA123456");
		t.setTicketStatus("Confirmed");
		t.setJourneyDate(pinfo.getJourneyDate());
		t.setPassengerName(pinfo.getFirstName()+" "+pinfo.getLastName());
		t.setTrainNumber(pinfo.getTrainNumber());
		t.setFrom(pinfo.getFrom());
		t.setTo(pinfo.getTo());
		t.setTicketPrice(550.00);
		
		TicketDto td = new TicketDto();
		td.setTkt(t);
		td.setTktStatus(t.getTicketStatus());
		td.setMessage("Ticket Booked Successfully!");
		
		
		
		return new ResponseEntity<TicketDto>(td, HttpStatus.CREATED);
		
	}

}
