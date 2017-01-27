package com.lara.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {

		List arlist12 = new LinkedList();
        
        arlist12.add("KUSUSMA");
        arlist12.add("Koneru");
        arlist12.add("Java");
        arlist12.add("Servlets");
        arlist12.add("JPS");
        arlist12.add(null);
        arlist12.add("10");
        arlist12.add(1000);

        for (Object s : arlist12) {
            System.out.println(":::::::::::::::::::::::LIST :::::::::::::OBJECT:::::" + s);
        }
		
	}

}
