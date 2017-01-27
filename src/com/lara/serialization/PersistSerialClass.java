package com.lara.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Calendar;
import java.util.Date;

//Class to persist the time in a flat file time.ser
public class PersistSerialClass 
{  
	/*public Date getTime() {
    	
        return Calendar.getInstance().getTime();
    }*/
	
    public static void main(String [] args) 
    {
        String filename = "time.ser";        
        
        if(args.length > 0)
        {
            filename = args[0];
        }		
        PersistSerialClass time = new PersistSerialClass();
        FileOutputStream fos = null;
        ObjectOutputStream out = null;   
try{
            fos = new FileOutputStream(filename);
            out = new ObjectOutputStream(fos);
            out.writeObject(time);
            out.close();
        }
       catch(IOException ex)
       {
            ex.printStackTrace();
        }  
       } 
    }
