/**
 * 
 */
package com.lara.collections;

import java.util.ArrayList;

/**
 * @author hadoop1
 *
 */
public class ArrayListDemo2 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        ArrayList al = new ArrayList();

        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        System.out.println("ArrayList " + al);

        al.add(2, 100);

        System.out.println(al);

        al.set(2, 1000);

        System.out.println("al " + al);
    }
}
