package com.veera.stringdemo;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		StringBuffer sb2 = new StringBuffer();
		
		StringBuilder sbd = new StringBuilder();

		StringBuffer sb = new StringBuffer("JAVA");
		System.out.println("capacity "+sb2.capacity());
		
		System.out.println("SB "+sb);
		
		System.out.println("SB hashcode "+sb.hashCode());

		
		sb.append("J2EE");
		
		System.out.println("afetr append SB "+sb);
		
		System.out.println("after SB hashcode "+sb.hashCode());
		
		


	}

}
