package com.veera.classdemo;



public class MethodDemo {
	
	
	public long getQube(int x){
		
		return x*x*x;
	}

	public static void main(String[] args) {
		
		MethodDemo qube = new MethodDemo();		

		System.out.println("qube of 16 "+qube.getQube(16));
		
		System.out.println("qube of 8 "+qube.getQube(8));
		
		
	}

}
