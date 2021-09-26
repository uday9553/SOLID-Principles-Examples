package com.uday.SRP;

public class Breaks {
	public void breaks(String type) {
		if(type.equals("air")) {
			System.out.println("Air breaks");
		}else if(type.equals("electronic")) {
			System.out.println("Electronic breaks");
		}else if(type.equals("ABS")) {
			System.out.println("abs breaks");
		}
	}
}
