/**
 * 
 */
package com.lara.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * @author RAVISUSMI Array list demo with comparable interface
 *
 */

class Dog implements Comparable<Dog>
{
    int legs;
    String use;
    String type;

    public Dog(int legs, String use, String type) {
        this.legs = legs;
        this.use = use;
        this.type = type;
    }

    @Override
    public String toString() {
        return "" +
                "[legs=" + legs + ", type=" + type + ", use=" + use + "]";
    }

    @Override
    public int compareTo(Dog o) {
        return use.compareToIgnoreCase(o.use);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + legs;
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        result = prime * result + ((use == null) ? 0 : use.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Dog other = (Dog) obj;
        if (legs != other.legs) return false;
        if (type == null) {
            if (other.type != null) return false;
        }
        else if (!type.equals(other.type)) return false;
        if (use == null) {
            if (other.use != null) return false;
        }
        else if (!use.equals(other.use)) return false;
        return true;
    }

}

public class ArrayListDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Dog d1 = new Dog(1, "security", "police");
        Dog d2 = new Dog(4, "pet", "Doburman");
        Dog d3 = new Dog(3, "Homely", "Hutch");
        Dog d4 = new Dog(0, "cute", "street");

        List<Dog> doglist = new ArrayList<Dog>(20);

        List list = new ArrayList(20);

        System.out.println("Size of Arraylist == " + list.size());

        doglist.add(d1);
        System.out.println("Size of Arraylist == " + doglist.size());
        doglist.add(d2);
        doglist.add(d3);
        doglist.add(d4);
        
        // doglist.add(100);

        System.out.println("DOGS  " + doglist);
        // Collections.sort(doglist);
        System.out.println("DOGS  " + doglist);

    }
}
