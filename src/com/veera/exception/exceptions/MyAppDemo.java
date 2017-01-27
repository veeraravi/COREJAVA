/**
 * 
 */
package com.javaclasses.exceptions;

/**
 * @author KAMAKSHI THAYI
 *
 */
public class MyAppDemo {
	
	public void cal() throws UserDefineExceptionDemo
	{
		int i =10;
		int j=0;
		
		try{
			i = i/j;
		}catch (ArithmeticException e) {
			throw new UserDefineExceptionDemo("WE can not divid by 0");
		}
	}

	/**
	 * @param args
	 * @throws UserDefineExceptionDemo 
	 */
	public static void main(String[] args) throws UserDefineExceptionDemo {
		
		MyAppDemo ma = new  MyAppDemo();
		ma.cal();
	}

}
