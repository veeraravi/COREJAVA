/**
 * 
 */
package com.lara.collections;

/**
 * @author hadoop1
 *
 */
public class EmployeeMap implements
        Comparable<EmployeeMap> {

    int id;
    String name;
    double sal;

    /**
     * @param id
     * @param name
     * @param sal
     */
    public EmployeeMap(int id, String name, double sal) {
        super();
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "EmployeeMap [id=" + id + ", name=" + name + ", sal=" + sal + "]";
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        long temp;
        temp = Double.doubleToLongBits(sal);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof EmployeeMap)) {
            return false;
        }
        EmployeeMap other = (EmployeeMap) obj;
        if (id != other.id) {
            return false;
        }
        if (name == null) {
            if (other.name != null) {
                return false;
            }
        }
        else if (!name.equals(other.name)) {
            return false;
        }
        if (Double.doubleToLongBits(sal) != Double.doubleToLongBits(other.sal)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(EmployeeMap o) {
        if (id == o.id) {
            return 0;

        }
        else if (id > o.id)
            return 1;
        else
            return -1;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */

}
