/**
 * 
 */
package com.lara.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/**
 * @author RAVISUSMI
 *
 */
public class SetDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {

        HashSet<String> set1 = new HashSet<String>();// No order no duplicates

        set1.add("a");
        set1.add("b");
        set1.add("e");
        set1.add("a");
        set1.add("c");
        set1.add("d");
        set1.add(null);

        Iterator it = set1.iterator();
        
        while (it.hasNext()) {
            System.out.println(it.next());

        }
        
        for(String s:set1){
        	System.out.println("ELEMENTS IN SET = "+s);
        }

        System.out.println("HashSet " + set1);

        System.out.println("=============================");

        Dog d1 = new Dog(1, "security", "police");
        Dog d5 = new Dog(1, "security", "police");
        Dog d6 = new Dog(1, "security", "police");
        Dog d2 = new Dog(4, "pet", "Doburman");
        Dog d3 = new Dog(3, "Homely", "Hutch");
        Dog d4 = new Dog(0, "cute", "street");

        System.out.println("Hash Code d1 " + d1.hashCode());
        System.out.println("Hash Code d2 " + d2.hashCode());
        System.out.println("Hash Code d3 " + d3.hashCode());
        System.out.println("Hash Code d4 " + d4.hashCode());
        System.out.println("Hash Code d5 " + d5.hashCode());
        System.out.println("Hash Code d6 " + d6.hashCode());

        HashSet<Dog> dogset = new HashSet<Dog>();// No order no duplicates
        dogset.add(d1);
        dogset.add(d2);
        dogset.add(d3);
        dogset.add(d5);
        dogset.add(d6);
        System.out.println("Dog HashSet " + dogset);

        System.out.println("---------------------------------");
        
        

        LinkedHashSet<String> s1 = new LinkedHashSet<String>();// No duplicates,
                                                               // but
        // ordered which ever order
        // you enter it will same
        // order

        s1.add("a");
        s1.add("b");
        s1.add("e");
        s1.add("a");
        s1.add("c");
        s1.add("d");
        s1.add(null);

        System.out.println("LinkedHashSet " + s1);
        System.out.println("---------------------------------");

        TreeSet<String> s2 = new TreeSet<String>();// Sorted form, No Duplicates
                                                   // and
        // no null

        s2.add("a");
        s2.add("b");
        s2.add("e");
        s2.add("a");
        s2.add("c");
        s2.add("d");

        // s2.addAll(dogset)
        // s2.add(null); not allowed

        TreeSet<Dog> dogtreeset = new TreeSet<Dog>();// Sorted form, No
                                                     // Duplicates
        // and
        // no null
        dogtreeset.addAll(dogset);

        System.out.println("TreeSet " + s2);
        System.out.println("Dog TreeSet " + dogtreeset);

        System.out.println("=====================EMPLOYEES==============");

        EmployeeSet ravi = new EmployeeSet(101, "Ravi", 100000.00);
        EmployeeSet veera = new EmployeeSet(101, "Ravi", 100000.00);

        EmployeeSet saurabh = new EmployeeSet(102, "saurabh", 100000.00);

        EmployeeSet manju = new EmployeeSet(103, "Manju", 100000.00);

        HashSet<EmployeeSet> employees = new HashSet<EmployeeSet>();
        employees.add(ravi);
        employees.add(veera);
        employees.add(saurabh);
        employees.add(manju);

        System.out.println("Employee " + employees);

        TreeSet<EmployeeSet> emptree = new TreeSet<EmployeeSet>();

        emptree.addAll(employees);

        System.out.println("TREESET " + emptree);

    }

}
