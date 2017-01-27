package com.veera.seialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


class Employee implements Serializable{
	int empid;
	String name;
	transient double sal;
	/**
	 * @param empid
	 * @param name
	 * @param sal
	 */
	public Employee(int empid, String name, double sal) {
		super();
		this.empid = empid;
		this.name = name;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", sal=" + sal
				+ "]";
	}
	
}


//IS - A relation

class Programmer extends Employee{
	
	double bonus = 10000;

	public Programmer(int empid, String name, double sal) {
		super(empid, name, sal);
	}
	
}

public class SerializationDemo {

	public static void main(String[] args) throws Exception {
		
		Employee ravi = new Employee(100, "VEERARAVI", 1999.00);
		
		Programmer veera = new Programmer(100, "VEERARAVI", 1999.00);
		
		FileOutputStream fout = new FileOutputStream("employee.txt");
		
		ObjectOutputStream eout = new ObjectOutputStream(fout);
		
		eout.writeObject(veera);
		
		eout.flush();
		
		System.out.println("DONE");
		
		System.out.println("==========+SErialization is completed====================");
		
		FileInputStream fin = new FileInputStream("employee.txt");
		
		ObjectInputStream ein = new ObjectInputStream(fin);
		
	//	Employee dRavi = (Employee) ein.readObject();
		Programmer dRavi = (Programmer)ein.readObject();
		
		
		System.out.println("==========+Desrialization is completed====================");
		
		System.out.println("After deserilizing id "+dRavi);
		System.out.println("After deserialing bonus "+ dRavi.bonus);
		System.out.println("After deserilizing sal "+dRavi.sal);

		

	}

}
