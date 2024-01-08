package com.movie.ticket.service;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.movie.ticket.entity.TicketEntity;
import com.movie.ticket.entity.TicketRepository;
import com.movie.ticket.model.Movies;
import com.movie.ticket.model.Payment;

@Service
public class TicketService {
	private static final Logger logger = LoggerFactory.getLogger(TicketService.class);
	
	@Autowired
	TicketRepository repository;
	@Autowired
	RestTemplate template;
	String response;
	
	public Movies[] getMovies() {
		// TODO Auto-generated method stub
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity <String> entity = new HttpEntity<String>(headers);
		String url="http://localhost:9091/getMovies";
		Movies[] movies = template.exchange(url, HttpMethod.GET, entity, Movies[].class).getBody();
		return movies;
	}

	public String bookTicket(TicketEntity entity) {
		// TODO Auto-generated method stub
		response = "Ticket booked successfully";
		repository.save(entity);
		logger.info(response);
		return response;
	}

	public Movies getMoviesByName(String moviename) {
		// TODO Auto-generated method stub
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>(headers);
		String url = "http://localhost:9091/getMoviesByName";
		Movies movie = template.exchange(url, HttpMethod.GET, entity, Movies.class).getBody();
		return movie;
	}

	public String cancelTicketById(int id) {
		// TODO Auto-generated method stub
		response = "Ticket canceled successfully";
		repository.deleteById(id);
		logger.info(response);
		return response;
	}

	public String pay(Payment payment) {
		// TODO Auto-generated method stub
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<Payment> entity = new HttpEntity<Payment>(payment,headers);
		String url = "http://localhost:9092/pay";
		String result = template.exchange(url, HttpMethod.POST, entity, String.class).getBody();
		return result;
	}

	public Payment[] getPaymentDetails() {
		// TODO Auto-generated method stub
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>(headers);
		String url = "http://localhost:9092/getPaymentDetails";
		Payment[] payment = template.exchange(url, HttpMethod.GET, entity, Payment[].class).getBody();
		return payment;
	}

	public Payment getPaymentDetailsById(int id) {
		// TODO Auto-generated method stub
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>(headers);
		String url = "http://localhost:9092/getPaymentDetails";
		Payment payment = template.exchange(url, HttpMethod.GET, entity, Payment.class).getBody();
		return payment;
	}
	
}
