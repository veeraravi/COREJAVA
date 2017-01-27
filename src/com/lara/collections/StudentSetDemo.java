package com.lara.collections;

import java.util.HashSet;
import java.util.TreeSet;

public class StudentSetDemo {
    public static void main(String[] args) {
        Students hemanth = new Students(110, "Hemanth", 100);
        Students hemanth2 = new Students(110, "Hemanth", 100);

        Students Bindu = new Students(111, "Bindu", 100);

        Students ravi = new Students(112, "ravi", 99);

        HashSet<Students> stSet = new HashSet<Students>();
        stSet.add(hemanth);
        stSet.add(hemanth2);

        stSet.add(Bindu);

        stSet.add(ravi);

        System.out.println("Set of Students in Hashset " + stSet);

        TreeSet<Students> stTreeSet = new TreeSet<Students>();

        stTreeSet.addAll(stSet);

        System.out.println("Set of Students in Treeset " + stTreeSet);

    }
}
