package com.movie.ticket.model;

public class Movies {
	private int id;
	private String moviename;
	private String date;
	private String time;
	private String theatername;
	private double price;
	/**
	 * 
	 */
	public Movies() {
		super();
	}
	/**
	 * @param id
	 * @param moviename
	 * @param date
	 * @param time
	 * @param theatername
	 * @param price
	 */
	public Movies(int id, String moviename, String date, String time, String theatername, double price) {
		super();
		this.id = id;
		this.moviename = moviename;
		this.date = date;
		this.time = time;
		this.theatername = theatername;
		this.price = price;
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
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Movies [id=" + id + ", moviename=" + moviename + ", date=" + date + ", time=" + time + ", theatername="
				+ theatername + ", price=" + price + "]";
	}
	
	
}
