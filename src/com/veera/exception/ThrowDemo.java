package com.veera.exception;

public class ThrowDemo {
	
	public void ageValidate(int age) throws Exception{
		
		if(age<=13){
			throw new Exception("Invalid age to vote");
			
		}
		else
		{
			System.out.println("Success");
		}
	}

	public static void main(String[] args) {

		ThrowDemo td = new ThrowDemo();
	//	td.ageValidate(13);
		
		try {
			td.ageValidate(13);
		} catch (Exception e) {
			System.out.println("I AM FROM CATCH--oops age is 13 lets change");
			e.printStackTrace();
			try {
				td.ageValidate(14);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
	}

}
