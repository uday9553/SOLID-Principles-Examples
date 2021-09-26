package com.uday.SRP;

public class Gears {
	public void gears(String type) {
		if(type.equals("manual")) {
			System.out.println("Manual transmission");
		}else if(type.equals("auto")) {
			System.out.println("Auto transmission");
		}else if(type.equals("imt")) {
			System.out.println("IMT transmission");
		}
	}
}
