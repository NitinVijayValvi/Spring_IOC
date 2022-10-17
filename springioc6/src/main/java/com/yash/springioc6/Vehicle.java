package com.yash.springioc6;

public class Vehicle {

	private String vehicle_name;
	private String vehicle_type;

	private Engine engineObj;

	private String mileage;
	private String price;

	public String getVehicle_name() {
		return vehicle_name;
	}

	public void setVehicle_name(String vehicle_name) {
		this.vehicle_name = vehicle_name;
	}

	public String getVehicle_type() {
		return vehicle_type;
	}

	public void setVehicle_type(String vehicle_type) {
		this.vehicle_type = vehicle_type;
	}

	public Engine getEngineObj() {
		return engineObj;
	}

	public void setEngineObj(Engine engineObj) {
		this.engineObj = engineObj;
	}

	public String getMileage() {
		return mileage;
	}

	public void setMileage(String mileage) {
		this.mileage = mileage;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public void display() {
//		System.out.println("Display Vehicles");

		System.out.println(vehicle_type + "  " + vehicle_name + "  " + engineObj.getEngine_type() + "  "
				+ engineObj.getEngine_name() + "  " + engineObj.getEngine_power() + "  " + mileage + "  " + price);

	}

}
