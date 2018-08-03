package com.designpatterns.creational.prototype;

public class SwiftDzire extends Car {

	private MarutiModels model;
	
	public SwiftDzire(String vin, MarutiModels model, int year) {
		super(vin);
		make = Make.MARUTI;
		type = CarType.HATCHBACK;
		this.model = model;
		this.year = year;
	}

	@Override
    protected String getCarDetails() {
    	return "VIN: "+this.vin
    		+"\nMake: "+this.make
    		+"\nModel: "+this.model
    		+"\nType: "+this.type
    		+"\nYear: "+this.year;
    }
	
	
}
