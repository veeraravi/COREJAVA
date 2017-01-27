package com.lara.serialization;

public class Student implements java.io.Serializable {
    /**
	 * 
	 */
    private static final long serialVersionUID = 1L;
    public String name;
    public String address;
    public int rollno;
    public int roomNo;
    public String lastName;

    /**
     * @param name
     * @param address
     * @param rollno
     * @param roomNo
     */
    public Student(String name, String address, int rollno, int roomNo, String lastName) {
        super();
        this.name = name;
        this.address = address;
        this.rollno = rollno;
        this.roomNo = roomNo;
        this.lastName = lastName;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Student [name=" + name + ", address=" + address + ", rollno="
                + rollno + ", roomNo=" + roomNo + "]";
    }

}