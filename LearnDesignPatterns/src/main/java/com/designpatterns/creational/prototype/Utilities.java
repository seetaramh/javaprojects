package com.designpatterns.creational.prototype;

import java.util.Random;

public class Utilities {

	public static String getRandomString(String prefix) {
		int max = 99999;
		int min = 0;
		
		Random rand = new Random();

		int  n = rand.nextInt((max - min) + 1) + min;
		
		return prefix+n; 
	}
	
	public static String getRandomString(String prefix, int minno, int maxno) {
		Random rand = new Random();

		int  n = rand.nextInt((maxno - minno) + 1) + minno;
		
		return prefix+n; 
	}
	
	public static long getRandomNo(int minno, int maxno) {
		Random rand = new Random();

		return rand.nextInt((maxno - minno) + 1) + minno;
	}
	
	
}
