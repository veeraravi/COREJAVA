package com.veera.inheritance;

public class Employee {
	
	int id;
	String empName;
	double salary;
	
	Address empAddress;
	
	/**
	 * @param id
	 * @param empName
	 * @param salary
	 * @param empAddress
	 */
	public Employee(int id, String empName, double salary, Address empAddress) {
		this.id = id;
		this.empName = empName;
		this.salary = salary;
		this.empAddress = empAddress;
	}

	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", empName=" + empName + ", salary="
				+ salary + ", empAddress=" + empAddress + "]";
	}



	public static void main(String[] args) {
	
		Address myadd = new Address("h44", 44, "4th cross", "Bangalore", "KARNATAKA", "INDIA", 560016);
		
		Employee ravi = new Employee(101, "VEERARAVI", 112244455, myadd);
		
		System.out.println("Employee = " + ravi);
		

	}

}
