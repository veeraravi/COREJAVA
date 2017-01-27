package com.lara.externalization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

	public class Car implements Externalizable {
		    String name;
		    int year;
		    int number;
		    /*
		     * mandatory public no-arg constructor
		     */
		    public Car() { super(); }
		   Car(String n, int y,int number) {
	    	name = n;
			year = y;
			this.number = number;
		    }
		   /** 
		     * Mandatory writeExernal method. 
		     */
		    public void writeExternal(ObjectOutput out) throws IOException  {
			out.writeObject(name);
			out.writeInt(year);
			out.writeInt(number);
		    }
		    /** 
		     * Mandatory readExternal method. 
		     */
		    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
			name = (String) in.readObject();
			year = in.readInt();
			number = in.readInt();
		    }
		    /* (non-Javadoc)
			 * @see java.lang.Object#toString()
			 */
			@Override
			public String toString() {
				return "Car [name=" + name + ", year=" + year + ", number="
						+ number + "]";
			}
		}
