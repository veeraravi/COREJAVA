package com.lara.externalization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Car1 extends Automobile implements Externalizable {
    String name;
    int year;
    
     //* mandatory public no-arg constructor
     
    public Car1() 
    { super(); 
    }
     Car1(String n, int y) {
    	 super("1212","20KML");
	name = n;
	year = y;
    }
    /** *
     * Mandatory writeExernal method. 
     **/
    public void writeExternal(ObjectOutput out) throws IOException  {
	 
	/* Since the superclass does not implement the Serializable interface
	 * we explicitly do the saving.
	 */
	out.writeObject(regNo);
	out.writeObject(mileage);
 	//Now the subclass fields
	out.writeObject(name);
	out.writeInt(year);
    }

    /** 
     * Mandatory readExternal method. 
     */
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
	 
	 /* Since the superclass does not implement the Serializable interface
	 * we explicitly do the restoring*/
	 
	regNo = (String) in.readObject();
	mileage = (String) in.readObject();
	
	//Now the subclass fields
	name = (String) in.readObject();
	year = in.readInt();
    }
   /** 
     * Prints out the fields. used for testing!
     */
    public String toString() {
        return("Reg No: " + regNo + "\n" + "Mileage: "  + mileage + "\n" +
		       "Name: " + name + "\n" + "Year: " + year );
    }
}
