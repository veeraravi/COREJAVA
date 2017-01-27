/**
 * 
 */
package com.lara.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author hadoop1
 *
 */
public class HashMapEmployee {

    /**
     * @param args
     */
    public static void main(String[] args) {

        EmployeeMap ravi = new EmployeeMap(101, "ravi", 10000);

        EmployeeMap raja = new EmployeeMap(101, "ravi", 10000);

        EmployeeMap sai = new EmployeeMap(102, "sai", 10000);

        EmployeeMap naidu = new EmployeeMap(103, "naidu", 10000);

        Map<EmployeeMap, EmployeeMap> empMap = new HashMap<EmployeeMap, EmployeeMap>();

        Map<EmployeeMap, EmployeeMap> empMapTree = new TreeMap<EmployeeMap, EmployeeMap>();

        empMap.put(ravi, ravi);
        empMap.put(raja, raja);

        empMap.put(sai, sai);

        empMap.put(naidu, naidu);

        System.out.println("MAPDEMO" + empMap.get(raja));

        System.out.println("MAPDEMO" + empMap.get(ravi));

        empMapTree.putAll(empMap);

        System.out.println("TREE Map " + empMapTree);

    }

}
