/**
 * 
 */
package com.javaclasses.exceptions;

/**
 * @author KAMAKSHI THAYI
 *
 */
public class WrapperClasses {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
/**
 * byte --> Byte
 * short --> Short
 * int --> Integer
 * long --> Long
 * float --> Float
 * double --> Double
 * char --> Character
 * boolean --> Boolean
 * 
 * ex:
 * Byte b1 = new Byte(10);
 * b1.
 * */
		byte b1 = 120;
		Byte b = new Byte((byte)122);
		Integer in = new Integer(10);
		Long l = new Long(100000);
		Float flt = new Float(2100);
		
		int i = in.intValue();
		
		System.out.println("I value "+i);
		
		System.out.println("Long Value "+l);
		
		System.out.println("Integer Value"+in.intValue());
		
		System.out.println("BYTE Value "+b);
		
		System.out.println("FLOAT Value "+flt);
		
		
	}

}
