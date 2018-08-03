package com.designpatterns.creational.prototype;

import java.util.HashMap;

public class CarCache {
	
	 private static HashMap<String, Car> carMap  = new HashMap<String, Car>();

	   public static Car getCar(String makeModel) {
	      Car cachedCar = carMap.get(makeModel);
	      return (Car) cachedCar.clone();
	   }

	   
	   public static void loadCache() {
	      Baleno baleno = new Baleno(Utilities.getRandomString("Baleno"), MarutiModels.BALENO, 2018);
	      carMap.put("BALENO",baleno);

	      Swift swift = new Swift(Utilities.getRandomString("Swift"), MarutiModels.SWIFT, 2018);
	      carMap.put("SWIFT",swift);

	      SwiftDzire swiftDzire = new SwiftDzire(Utilities.getRandomString("SwiftDzire"), MarutiModels.DZIRE, 2018);
	      carMap.put("SWIFTDZIRE",swiftDzire);
	      
	      VitaraBrezza vitaraBrezza = new VitaraBrezza(Utilities.getRandomString("VitaraBrezza"), MarutiModels.VITARA_BREZZA, 2018);
	      carMap.put("VITARABREZZA",vitaraBrezza);
	      
	   }	

}
