package com.veera.comparing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee{
	int id;
	String name;
	double sal;
	/**
	 * @param id
	 * @param name
	 * @param sal
	 */
	public Employee(int id, String name, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	
	@Override
	public String toString() {
		return "[ "+ id + "," + name + "," + sal + " ]";
	}
	
}

class IdComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee emp1, Employee emp2) {

		if(emp1.id == emp2.id){
			return 0;
		}else if(emp1.id > emp2.id)
			return 1;
		else{		
		  return -1;
		}
	}
	
}


class NameComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee emp1, Employee emp2) {
		return emp1.name.compareTo(emp2.name);
	}
	
}


class SalComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee emp1, Employee emp2) {
		if(emp1.sal == emp2.sal){
			return 0;
		}else if(emp1.sal > emp2.sal)
			return 1;
		else{		
		  return -1;
		}	}
	
}

public class ComparatorDemo {

	public static void main(String[] args) {
		
		Employee veera = new Employee(101, "VEERA", 1000);
		Employee ravi = new Employee(100, "RAVI", 10001);
		
		Employee kumar = new Employee(99, "KUMAR", 1002);
		
		Employee java = new Employee(1000, "JAVA", 1030);
		Employee j2ee = new Employee(1010, "J2EE", 13000);

		Employee hadoop = new Employee(101010, "HADOOP", 100000);		

		
		IdComparator idcomp = new IdComparator();
		
		NameComparator nameComp =new NameComparator();
		
		SalComparator salComp = new SalComparator();
		
		
		List<Employee> student = new ArrayList<Employee>();
		
		student.add(veera);
		student.add(kumar);
		student.add(ravi);
		student.add(java);
		student.add(j2ee);
		student.add(hadoop);
		
		System.out.println("Before sort based on id arraylist "+student);
		
		Collections.sort(student,idcomp);
		
		System.out.println("After sort based on id arraylist "+student);
		
		System.out.println("======================================================================");
		System.out.println("");
		
		
		System.out.println("Before sort based on name arraylist "+student);
		
		Collections.sort(student,nameComp);
		
		System.out.println("After sort based on name arraylist "+student);
		
		System.out.println("======================================================================");
		System.out.println("");
		
		
		System.out.println("Before sort based on sal arraylist "+student);
		
		Collections.sort(student,salComp);
		
		System.out.println("After sort based on sal arraylist "+student);

	}

}
