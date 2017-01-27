package com.veera.comparing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo implements Comparable {

	int id;
	String name;
	double sal;
	
	/**
	 * @param id
	 * @param name
	 * @param sal
	 */
	public ComparableDemo(int id, String name, double sal) {
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	
	

	@Override
	public String toString() {
		return "[ "+ id + "," + name + "," + sal + " ]";
	}



	public static void main(String[] args) {
		ComparableDemo veera = new ComparableDemo(101, "VEERA", 1000);
		ComparableDemo ravi = new ComparableDemo(100, "RAVI", 1000);

		ComparableDemo kumar = new ComparableDemo(99, "KUMAR", 1000);

		System.out.println("compare veera nd ravi "+veera.compareTo(ravi));
		
		List<ComparableDemo> student = new ArrayList<ComparableDemo>();
		
		student.add(veera);
		student.add(kumar);
		student.add(ravi);
		
		System.out.println("Before sort arraylist "+student);
		
		Collections.sort(student);
		
		System.out.println("After sort arraylist "+student);

		
	}

	@Override
	public int compareTo(Object obj) {
		
		ComparableDemo ravi = (ComparableDemo)obj;
		
		if(this.id == ravi.id){
			return 0;
		}else if(this.id>ravi.id)
			return 1;
		else{		
		  return -1;
		}
	}
	
	

}
