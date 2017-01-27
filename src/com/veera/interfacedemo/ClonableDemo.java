package com.veera.interfacedemo;

import java.io.Serializable;
import java.rmi.Remote;
import java.util.RandomAccess;

public class ClonableDemo implements Cloneable,Serializable,RandomAccess,Remote {

	public static void main(String[] args) {
		ClonableDemo cd = new ClonableDemo();
		
	}
	

}
