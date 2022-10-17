package com.yash.springioc1;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class City {

	private int cityid;

	public int getCityid() {
		return cityid;
	}

	public void setCityid(int cityid) {
		this.cityid = cityid;
	}

	private String cityname;

	private Set<CinemaHall> cinemaHall;

	public Set<CinemaHall> getCinemaHall() {
		return cinemaHall;
	}

	public void setCinemaHall(Set<CinemaHall> cinemaHall) {
		this.cinemaHall = cinemaHall;
	}

	public String getCityname() {
		return cityname;
	}

	public void setCityname(String cityname) {
		this.cityname = cityname;
	}

	@Override
	public String toString() {
		return "City [cityid=" + cityid + ", cityname=" + cityname + ", cinemaHall=" + cinemaHall + ", toString()="
				+ super.toString() + "]";
	}

	public void display() {

		System.out.println("Movies display in City");

		System.out.println("----------------------------------------------");

		System.out.println("City: " + cityid + " Cityname: " + cityname);
		/*
		 * for(CinemaHall ch: cinemaHall) { System.out.println( ""+ch.getCid()+""
		 * +ch.getCinemahallname()+ " "+ch.getMoviel().toString()); }
		 */

		Iterator<CinemaHall> cineIterator = cinemaHall.iterator();
		while (cineIterator.hasNext()) {
			
			System.out.println(cineIterator.next());

		}

	}

}
