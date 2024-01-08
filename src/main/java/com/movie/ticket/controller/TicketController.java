package com.movie.ticket.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.movie.ticket.entity.TicketEntity;
import com.movie.ticket.model.Movies;
import com.movie.ticket.model.Payment;
import com.movie.ticket.service.TicketService;

@RestController
public class TicketController {
	private static final Logger logger = LoggerFactory.getLogger(TicketController.class);
	
	@Autowired
	TicketService service;
	
	String response;
	
	@GetMapping("/searchMovies")
	public Movies[] getMovies(){
		return service.getMovies();		
	}
	@GetMapping("searchMoviesByName")
	public Movies getMoviesByName(@RequestParam String moviename) {
		return service.getMoviesByName(moviename);
	}
	
	@PutMapping("/bookTicket")
	public String bookTicket(@RequestBody TicketEntity entity) {
		response = "Ticket booked successfully";
		logger.info(response);
		return service.bookTicket(entity);
	}
	@DeleteMapping("/cancelTicket")
	public String cancelTicketById(@RequestParam int id) {
		response = "Ticket cancel successfully";
		logger.info(response);
		return service.cancelTicketById(id);
	}
	@PostMapping("/pay")
	public String pay(@RequestBody Payment payment) {
		return service.pay(payment);
	}
	@GetMapping("/getPaymentDetails")
	public Payment[] getPaymentDetails() {
		return service.getPaymentDetails();
	}
	@GetMapping("/getPaymentDetailsById")
	public Payment getPaymentDetailsById(@RequestParam int id) {
		return service.getPaymentDetailsById(id);
	}
}
