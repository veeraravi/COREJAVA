package com.veera.inheritance;

public class Address {
	String hNo;
	int stNo;
	String stName;
	String city;
	String state;
	String country;
	long pin;
	
	/**
	 * @param hNo
	 * @param stNo
	 * @param stName
	 * @param city
	 * @param state
	 * @param country
	 * @param pin
	 */
	public Address(String hNo, int stNo, String stName, String city,
			String state, String country, long pin) {
		this.hNo = hNo;
		this.stNo = stNo;
		this.stName = stName;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pin = pin;
	}


	@Override
	public String toString() {
		
		return "stNo=" + stNo + ", stName=" + stName
				+ ", city=" + city + ", state=" + state + ", country="
				+ country + ", pin=" + pin;
	}





	public static void main(String[] args) {

		Address myadd = new Address("h44", 44, "4th cross", "Bangalore", "KARNATAKA", "INDIA", 560016);
		
		System.out.println("Address = "+myadd);
		
		System.out.println("stNo=" + myadd.stNo + ", stName=" + myadd.stName
				+ ", city=" + myadd.city + ", state=" + myadd.state + ", country="
				+ myadd.country + ", pin=" + myadd.pin);
		
		
	}

}
