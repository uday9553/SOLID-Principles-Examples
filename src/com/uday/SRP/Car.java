package com.uday.SRP;

//This class has mulitple responsibilities, so we can split them 
public class Car {
	
	public void gears(String type) {
		if(type.equals("manual")) {
			System.out.println("Manual transmission");
		}else if(type.equals("auto")) {
			System.out.println("Auto transmission");
		}else if(type.equals("imt")) {
			System.out.println("IMT transmission");
		}
	}
	
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
