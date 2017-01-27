/**
 * 
 */
package com.javaclasses.exceptions;

import java.util.Arrays;


/**
 * @author KAMAKSHI THAYI
 *
 */
public class DemoTwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *A
		 * 123  +   378     = 
		 * 345  +   256    
		 * 
		 * B
		 * 378
		 * 256
		 *
		 * A+B
		 * 
		 * 
		 * */
		
		int a[][] ={{1,2,3},{3,4,5}};
		int b[][] ={{3,7,8},{2,5,6}};
		//int c[][]  [][];
    	int c[][] = {{0,0,0},{0,0,0}};
    	int[] d = {1,2,3,4};
    	
	
		for(int i =0; i<2; i++)
		{
			for(int j=0; j<3;j++)
			{
			c[i][j]= a[i][j] +b[i][j];
			System.out.print(c[i][j]+" ");
			
			}
			System.out.println();
			
//		System.out.println("c values final " +c[0][0]+" " + c[0][1] + " " + c[0][2]);
	//	System.out.println("c values final " +c[1][0]+" " + c[1][1] + " " + c[1][2]);
	}
		System.out.println("c values final-row1 " +c[0][0]+" " + c[0][1] + " " + c[0][2]);
		System.out.println("c values final-row2 " +c[1][0]+" " + c[1][1] + " " + c[1][2]);
		System.out.println("values " + d[0]);
		System.out.println(" "+Arrays.toString(c));
	}
}