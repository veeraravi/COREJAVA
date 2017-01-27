/**
 * 
 */
package com.lara.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * @author VEERASUSMI
 *
 */

class Emloyee
{
	public String empname ;
	public String empnumber ;
	
	public Emloyee(String name, String number) {
		empname = name;
		empnumber = number;
	}
	
	public void display()
	{
		System.out.println("EMP name = "+empname);
		System.out.println("EMP number = "+empnumber);
	}

	@Override
	public String toString() {
		return "Emloyee [empname=" + empname + ", empnumber=" + empnumber + "]";
	}
	
}
class Dept
{
	public String depname ;
	public String depnumber ;
	
	public Dept(String name, String number) {
		depname = name;
		depnumber = number;
	}
	
	public void display()
	{
		System.out.println("EMP name = "+depname);
		System.out.println("EMP number = "+depnumber);
	}

	@Override
	public String toString() {
		return "Dept [depname=" + depname + ", depnumber=" + depnumber + "]";
	}
	
	
}

public class GetMethodofClassinArrayList 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Emloyee e1= new Emloyee("RAJU", "E101");
		Emloyee e2= new Emloyee("RAMU", "E102");
		Dept d1 =new Dept("IT", "IT1");
		Dept d2 =new Dept("nIT", "nIT1");
		
		List<Object> list = new ArrayList<Object>();		
		list.add(e1);
		list.add(e2);
		list.add(d1);
		list.add(d2);
		
		System.out.println(list);
		
	}

}
