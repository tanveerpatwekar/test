package com.model.studentaddress;

public class StudentAddressTester {

	public static void main(String[] args) {
		
		Address addr = new Address("Pune", "Hinjewadi");
		
		Student s1 = new Student(101, "Tanveer", addr);
		
		System.out.println("Student Roll No: "+s1.rollNo);
		System.out.println("Student Name: "+s1.name);
		System.out.println("City Name: "+s1.addr.cityName);
		System.out.println("Area Name: "+s1.addr.areaName);
		
	}

}
