package com.veera.stringdemo;

public class StringLiteral {

	public static void main(String[] args) {

		String course = "JAVA";
		
		String name = "JAVA";
		
		
		String newName = new String("JAVA");
		
		//newName = newName+"HADOOP";
		
		System.out.println("B4 HASH CODE of COURSE "+course.hashCode());
		
		System.out.println("B4 HASH CODE OF NAME "+name.hashCode());
		
		System.out.println("B4 HASH CODE OF new NAME "+newName.hashCode());	
		
		
	//	course = course + " "+"J2EE"; //JAVA J2EE
		
	//	System.out.println("AFTER HASH CODE of COURSE "+course.hashCode());
		
	//	System.out.println("AFTER HASH CODE OF NAME "+name.hashCode());
		
		
		if(course == name){
			System.out.println("BOTH course and name REFERING SAME object");
		}
		
		if(course.equals(name)){
			System.out.println("BOTH  course and name have SAME VALUE");

		}
		
		if(name == newName){
			System.out.println("BOTH NAME AND NEWNAME ARE SAME");
		}
		
		if(newName.equals(name)){
			System.out.println("BOTH  name and newname have SAME VALUE");

		}else{
			System.out.println("BOTH are name and newname does not have SAME VALUE");
		}
		
		
		System.out.println("CHAR AT "+course.charAt(2));
		
		course = course.concat("HADOOP"); // JAVAHADOOP
		
		System.out.println("CONCAT  "+course.concat("HADOOP"));
		
		System.out.println("contains  "+course.contains("VA"));
		
		
		System.out.println("AFTER CONCAT COURSE "+course);

		
	}

}
