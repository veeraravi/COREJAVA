package com.lara.collections;

import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class ListDemo {

    public static void main(String[] args) {

        // with out generics

        ArrayList arlist = new ArrayList();

        ArrayList list1 = new ArrayList();

        list1.add(1000.000f);
        list1.add(2000000000);
        list1.add('@');
        list1.add('K');
        list1.add("RAVI");
        list1.add(100000);
        list1.add('@');
        
        list1.add(4,"HADOOP");

        
        System.out.println("=====list1=== "+list1);
        
        System.out.println("=====list1 get 4th element === "+list1.get(4));

        
        
        System.out.println("Array List size " + arlist.size());
        arlist.ensureCapacity(200);
        System.out.println("Array List size " + arlist.size());

        arlist.add("KUSUSMA");
        System.out.println("Array List size " + arlist.size());
        arlist.add(100000);
        arlist.add('K');

        arlist.add(1000.000f);
        arlist.add(2000000000);
        arlist.add('@');
        arlist.add('K');
        arlist.add(100000);

        arlist.add(null);

        arlist.addAll(0, list1);

        System.out.println("Array List " + arlist);

        System.out.println("==========================================");

        // with generics
        
        List<String> arlist2 = new ArrayList<String>();
        
        arlist2.add("KUSUSMA");
        arlist2.add("Koneru");
        arlist2.add("Java");
        arlist2.add("Servlets");
        arlist2.add("JPS");
        arlist2.add(null);
        arlist2.add("10");
        
        //not allowed non string values
       // arlist2.add(1000);

        for (String s : arlist2) {
            System.out.println(":::::::::::::::::::::::LIST:::::::::::::RAVI:::::" + s);
        }
        
        
        
        //==============
        
List arlist12 = new ArrayList();
        
        arlist12.add("KUSUSMA");
        arlist12.add("Koneru");
        arlist12.add("Java");
        arlist12.add("Servlets");
        arlist12.add("JPS");
        arlist12.add(null);
        arlist12.add("10");
        arlist12.add(1000);

        for (Object s : arlist12) {
            System.out.println(":::::::::::::::::::::::LIST :::::::::::::OBJECT:::::" + s);
        }
        

        arlist12.add(null);

        arlist12.add(null);

        arlist12.addAll(list1);

        arlist.addAll(arlist2);
        ArrayList al = (ArrayList) arlist.clone();

        System.out.println("Array List Retain " + al.retainAll(arlist2));
        System.out.println("=========Array List ==== " + arlist2);

        List list = new ArrayList(list1);

        System.out.println("List ************* " + list);

        System.out.println("List ************* " + list.get(3));
        
        

        Iterator it = arlist.iterator();
        
        while (it.hasNext()) {
            System.out.println("Iterating " + it.next());
        }

        for (Object s : arlist) {
            System.out.println(":::::::::::::::OBJECT FOR_EACH ;;;;;;;;;;;;;; " + s.toString());
        }

        Vector v = new Vector();

        ListIterator lt = arlist2.listIterator();

        /**
         * boolean offer(E e)--- Adds the specified element as the tail (last
         * element) of this list. boolean offerFirst(E e) -- Inserts the
         * specified element at the front of this list. boolean offerLast(E e)
         * -- Inserts the specified element at the end of this list. E peek() --
         * Retrieves, but does not remove, the head (first element) of this
         * list. E peekFirst() Retrieves, but does not remove, the first element
         * of this list, or returns null if this list is empty. E peekLast()
         * Retrieves, but does not remove, the last element of this list, or
         * returns null if this list is empty. E poll() Retrieves and removes
         * the head (first element) of this list. E pollFirst() Retrieves and
         * removes the first element of this list, or returns null if this list
         * is empty. E pollLast() Retrieves and removes the last element of this
         * list, or returns null if this list is empty. E pop() Pops an element
         * from the stack represented by this list. void push(E e) Pushes an
         * element onto the stack represented by this list. E remove() Retrieves
         * and removes the head (first element) of this list.
         */

        Deque ll = new LinkedList();
        ll.offer("KUSUMA");
        ll.offer("Java");
        ll.offer("Servlets");
        ll.offerFirst("GOOD");
        ll.offerLast("Girl");
        System.out.println("Linked List " + ll);
        System.out.println(ll.peekLast());
        System.out.println("poll " + ll.pop());
        System.out.println("Linked List " + ll);

    }
}
