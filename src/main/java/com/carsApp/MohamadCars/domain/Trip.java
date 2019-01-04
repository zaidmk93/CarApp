package com.carsApp.MohamadCars.domain;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Trip {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long seqId;
	private String place;
	@ManyToMany(mappedBy="trips")
	private Set<Car> cars;
	
	
	public Trip( String place) {
		super();
		this.place = place;
	}

	public Trip() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Set<Car> getCars() {
		return cars;
	}

	public void setCars(Set<Car> cars) {
		this.cars = cars;
	}

	public Long getSeqId() {
		return seqId;
	}

	public void setSeqId(Long seqId) {
		this.seqId = seqId;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}
	

}
