package com.movie.ticket.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Movie Ticket")
public class TicketEntity {
	@Id
	int id;
	String name;
	long phone;
	String moviename;
	String date;
	String time;
	int numberofpersons;
	String theatername;
	double amount;
	/**
	 * 
	 */
	public TicketEntity() {
		super();
	}
	/**
	 * @param id
	 * @param name
	 * @param phone
	 * @param moviename
	 * @param date
	 * @param time
	 * @param numberofpersons
	 * @param theatername
	 * @param amount
	 */
	public TicketEntity(int id, String name, long phone, String moviename, String date, String time,
			int numberofpersons, String theatername, double amount) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.moviename = moviename;
		this.date = date;
		this.time = time;
		this.numberofpersons = numberofpersons;
		this.theatername = theatername;
		this.amount = amount;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the phone
	 */
	public long getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(long phone) {
		this.phone = phone;
	}
	/**
	 * @return the moviename
	 */
	public String getMoviename() {
		return moviename;
	}
	/**
	 * @param moviename the moviename to set
	 */
	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}
	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}
	/**
	 * @return the time
	 */
	public String getTime() {
		return time;
	}
	/**
	 * @param time the time to set
	 */
	public void setTime(String time) {
		this.time = time;
	}
	/**
	 * @return the numberofpersons
	 */
	public int getNumberofpersons() {
		return numberofpersons;
	}
	/**
	 * @param numberofpersons the numberofpersons to set
	 */
	public void setNumberofpersons(int numberofpersons) {
		this.numberofpersons = numberofpersons;
	}
	/**
	 * @return the theatername
	 */
	public String getTheatername() {
		return theatername;
	}
	/**
	 * @param theatername the theatername to set
	 */
	public void setTheatername(String theatername) {
		this.theatername = theatername;
	}
	/**
	 * @return the amount
	 */
	public double getAmount() {
		return amount;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "TicketEntity [id=" + id + ", name=" + name + ", phone=" + phone + ", moviename=" + moviename + ", date="
				+ date + ", time=" + time + ", numberofpersons=" + numberofpersons + ", theatername=" + theatername
				+ ", amount=" + amount + "]";
	}
	
	
}
