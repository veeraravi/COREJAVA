/**
 * 
 */
package com.lara.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

/**
 * @author hadoop1
 *
 */
public class ListDemo2 {

    /**
     * @param args
     */
    public static void main(String[] args) {

        // without genetics

        ArrayList list = new ArrayList();

        list.add(10);

        list.add("Sai");
        list.add(2, 20);
        list.add(10);
        list.add(30);
        list.add(60);
        list.add(21.52);
        list.add(null);

        ListIterator it = list.listIterator();

        while (it.hasNext()) {
            System.out.println("Element " + it.next());

        }

        Vector v = new Vector();
        v.add(10);
        v.addAll(list);
        v.add(5, "JAVA");

        System.out.println("Vector demo " + v);
        List l2 = new ArrayList();
        // list = v;
        // v=list2;

        List linkedlist = new LinkedList();

        // linkedlist.

    }
}
