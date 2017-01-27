package com.lara.collectionsClass;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/*Collections.frequency() method returns the number of elements in the specified collection equal to 
 * the specified object.
 *  Look at the below example code:
 *  search element No of times occured in list
 *  
 *  Collection
 *  
 *  Interface List extends Collection
 *  
 *  */
public class MyListFrequency {

    public static void main(String a[]) {

        List<String> ll = new LinkedList<String>();
        ll.add("one");
        ll.add("two");
        ll.add("three");
        ll.add("four");
        ll.add("two");
        ll.add("three");
        ll.add("two");
        ll.add("one");

        System.out.println("Actual list: " + ll);

        System.out.println("Actual list: " + ll.get(7));

        Collections.sort(ll);
        System.out.println("Frequency of 'one': " + Collections.frequency(ll, "one"));
        System.out.println("Frequency of 'three': " + Collections.frequency(ll, "three"));
        System.out.println("Frequency of 'two': " + Collections.frequency(ll, "two"));
        System.out.println("Sorted Form of List " + ll);
    }
}