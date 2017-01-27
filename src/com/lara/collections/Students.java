package com.lara.collections;

public class Students implements Comparable<Students> {

    int id;
    String name;
    int toalMarks;

    /**
     * @param id
     * @param name
     * @param toalMarks
     */
    public Students(int id, String name, int toalMarks) {
        super();
        this.id = id;
        this.name = name;
        this.toalMarks = toalMarks;
        System.out.println("Student " + name + " has been generated.");
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "[id=" + id + ", name=" + name + ", toalMarks=" + toalMarks + "]";
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
        result = prime * result + toalMarks;
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
        if (!(obj instanceof Students)) {
            return false;
        }
        Students other = (Students) obj;
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
        if (toalMarks != other.toalMarks) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Students o) {
        return name.compareToIgnoreCase(o.name);
    }

}
