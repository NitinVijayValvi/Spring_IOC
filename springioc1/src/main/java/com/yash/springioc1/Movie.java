package com.yash.springioc1;

import java.util.Date;

public class Movie {

	private int mid;
	private String moviename;
	private Date timings;

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public Movie() {
		System.out.println("default constructor");
	}

	public Movie(String moviename, Date timings) {
		super();
		this.moviename = moviename;
		this.timings = timings;
	}

	public Date getTimings() {
		return timings;
	}

	public void setTimings(Date timings) {
		this.timings = timings;
	}

	public String getMoviename() {
		return moviename;
	}

	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}

	public void show() {
		System.out.println("Movie name: " + moviename + "" + timings);
	}

	@Override
	public String toString() {
		return " Movie Name: "+moviename+ " Timings : "+timings;
	}
}
