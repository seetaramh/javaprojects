package com.designpatterns.creational.prototype;

public abstract class Car implements Cloneable {
	
	protected String vin;
	protected Make make;
	protected CarType type;
	protected int year;
	protected CarColors color;
	protected Double price;
	
	public Car(String vin) {
		this.vin = vin;
	}
	
	/**
	 * @return the vehicleIdentificationNo
	 */
	public String getVehicleIdentificationNo() {
		return vin;
	}
	/**
	 * @param vehicleIdentificationNo the vehicleIdentificationNo to set
	 */
	public void setVehicleIdentificationNo(String vehicleIdentificationNo) {
		this.vin = vehicleIdentificationNo;
	}
	/**
	 * @return the make
	 */
	public Make getMake() {
		return make;
	}
	/**
	 * @param make the make to set
	 */
	public void setMake(Make make) {
		this.make = make;
	}
	/**
	 * @return the type
	 */
	public CarType getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(CarType type) {
		this.type = type;
	}
	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}
	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}
	/**
	 * @return the color
	 */
	public CarColors getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(CarColors color) {
		this.color = color;
	}
	/**
	 * @return the price
	 */
	public Double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(Double price) {
		this.price = price;
	}
	
	
    protected String getCarDetails() {
    	return "VIN: "+this.vin
    		+"\nMake: "+this.make
    		+"\nType: "+this.type
    		+"\nYear: "+this.year;
    }
	
	   public Object clone() {
		      Object clone = null;
		      
		      try {
		         clone = super.clone();
		         
		      } catch (CloneNotSupportedException e) {
		         e.printStackTrace();
		      }
		      
		      return clone;
		   }
	
}
