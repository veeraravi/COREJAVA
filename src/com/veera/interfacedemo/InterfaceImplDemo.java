package com.veera.interfacedemo;

public class InterfaceImplDemo implements InterfaceDemo,Interface1,Interface2{

	public static void main(String[] args) {
		
		InterfaceImplDemo id = new InterfaceImplDemo();
		id.changeConf();
		id.disp();
		
		//id.MIN = 100;	

	}

	@Override
	public void changeConf() {
		System.out.println("I AM IMPLEMENTED METHOD");
		System.out.println("MIN "+MIN);
	}

	@Override
	public void disp() {

		System.out.println("I AM FROM DISP METHOD");
	}

	@Override
	public void prnt() {
		// TODO Auto-generated method stub
		
	}

	

}
