package com.veera.arraydemo;

public class ArrayDemo {

	public static void main(String[] args) {
		
		
		int a[] = new int[10];
		
		String[] names = {"JAVA","J2EE","HADOOP"};
		
		String s[] = new String[10];

		int[][] matrixA = new int[3][3];
		int[][] matrixB = new int[3][3];

		
		
		
		
		
		
		
		a[0]=10;
		//a[10]=100;
		
		//System.out.println("value 0 index "+a[0]);
		
		//System.out.println("Value of 10 index "+a[10]);
		
		
		for(int i=0;i<a.length;i++){
			
			System.out.println("VALUES OF A "+a[i]);
			
		}
		
		for(int i =0; i<names.length;i++){
			System.out.println("VALUES OF NAMES "+names[i]);
			
		}
		

		for(int i =0; i<s.length;i++){
			System.out.println("VALUES OF NAMES "+s[i]);
			
		}
		
		
		for(String sa : names){
			System.out.println(sa);
		}
		
	}

}
