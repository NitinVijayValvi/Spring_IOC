package com.yash.springioc1;

import java.util.Set;

public class CinemaHall {
	private int cid;
	private String cinemahallname;
	private Set<Movie> moviel;

	public Set<Movie> getMoviel() {
		return moviel;
	}

	public void setMoviel(Set<Movie> moviel) {
		this.moviel = moviel;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCinemahallname() {
		return cinemahallname;
	}

	public void setCinemahallname(String cinemahallname) {
		this.cinemahallname = cinemahallname;
	}

	@Override
	public String toString() {
		return "CinemaHall Name: "+cinemahallname+ "\n"
				+moviel.toString();
				
	}


}
