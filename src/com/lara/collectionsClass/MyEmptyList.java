package com.lara.collectionsClass;

import java.util.Collections;
import java.util.List;
 
public class MyEmptyList {
 
    public static void main(String a[]){
         
        List<String> myEmptyList = Collections.<String>emptyList();
        System.out.println("Empty list: "+myEmptyList);
        //we cn not any element after emptyList()
        //its Collections.emptyList() method returns the empty list (immutable). This list is serializable.
        //SET and MAP also same.
        myEmptyList.add("RAVI");
        System.out.println("Empty list: "+myEmptyList);
    }
}