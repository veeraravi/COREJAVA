package com.veera.comparing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingApp {

	public static void main(String[] args) {
		
		ComparableDemo veera = new ComparableDemo(101, "VEERA", 1000);
		ComparableDemo ravi = new ComparableDemo(100, "RAVI", 10001);

		ComparableDemo kumar = new ComparableDemo(99, "KUMAR", 1002);
		
		ComparableDemo java = new ComparableDemo(1000, "JAVA", 1030);
		ComparableDemo j2ee = new ComparableDemo(1010, "J2EE", 13000);

		ComparableDemo hadoop = new ComparableDemo(101010, "HADOOP", 100000);
		

		System.out.println("compare veera nd ravi "+veera.compareTo(ravi));
		
		List<ComparableDemo> student = new ArrayList<ComparableDemo>();
		
		student.add(veera);
		student.add(kumar);
		student.add(ravi);
		student.add(java);
		student.add(j2ee);
		student.add(hadoop);
		
		System.out.println("Before sort arraylist "+student);
		
		Collections.sort(student);
		
		System.out.println("After sort arraylist "+student);
		

	}

}
