/**
 * 
 */
package com.javaclasses.exceptions;

/**
 * @author KAMAKSHI THAYI
 *
 */
public class UserDefineExceptionDemo extends Exception{

	/**
	 * 
	 */
	//private static final long serialVersionUID = -5872418347501195202L;
	
	public UserDefineExceptionDemo(String s)
    {
        super(s);
    }

    public UserDefineExceptionDemo(String s, Throwable throwable)
    {
        super(s, throwable);
    }

    public UserDefineExceptionDemo(Throwable throwable)
    {
        super(throwable);
    }
    
    public String getMessage()
    {
    	return "";
    }

}
