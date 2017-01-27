package com.lara.collectionsClass;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//Collections.fill() method replaces all of the elements of the specified list with the specified element. 
//This method runs in linear time.You can find the example code below:
public class MyListFill {

   public static void main(String a[]){
        
       List<String> ll = new ArrayList<String>();
       ll.add("one");
       ll.add("two");
       ll.add("three");
       ll.add("four");
       System.out.println("Original List: "+ll);
       Collections.fill(ll, "TEMP_STRING");
       System.out.println("After fill: "+ll);
       
   }
}
