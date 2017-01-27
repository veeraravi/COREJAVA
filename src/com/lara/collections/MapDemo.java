/**
 * 
 */
package com.lara.collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author RAVISUSMI
 *
 */
public class MapDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {

        HashMap<String, String> hashmap = new HashMap<String, String>();
        Hashtable<String, String> hashtable = new Hashtable<String, String>();
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<String, String>();
        TreeMap<String, String> treemap = new TreeMap<String, String>();

        Map hashmap1 = new HashMap();

        hashmap1.put(10, "RAMU");
        /*
         * List --> ArrayList,LinkedList and Vector Set -->HashSet,LinkedHashSet
         * and TreeSet Map --> HashMap,HashTable,LinkedHashMap and TreeMap
         * 
         * Parent Class --> chiled object
         * 
         * Base b = new Sub();
         * 
         * child c = new Parent(); X not posible
         */

        // Hash Map allows null and no order no duplicate keys
        hashmap.put("1", "RAVI");

        hashmap.put("2", "RAJA");

        hashmap.put("3", "SUSMI");
        hashmap.put("4", "MOHIT");
        hashmap.put("7", "SAIRAM");
        hashmap.put("5", "SIVAYA");
        hashmap.put("6", "GOVINDA");
        /*
         * hashmap.put("name", null); hashmap.put(null, null); hashmap.put(null,
         * "SPRING");
         * 
         * hashmap.put(null, "GOVINDA2"); hashmap.put(null, "GOVINDA3");
         * hashmap.put(null, null); hashmap.put(null, "Kusuma");
         */

        System.out.println("****************** HASH MAP  == " + hashmap);
        System.out.println("****************** HASH MAP EntrySet == " + hashmap.entrySet());
        System.out.println("****************** HASH MAP Key == " + hashmap.keySet());
        System.out.println("****************** HASH MAP Values == " + hashmap.values());

        String source = null;
        source = hashmap.keySet().iterator().next();
        System.out.println("******************SOURCE ************* " + source);
        if ("1".equalsIgnoreCase(source)) {
            System.out.println("******************SOURCE ************* " + source);
        }

        hashmap.keySet();

        for (Map.Entry<String, String> map : hashmap.entrySet())
        {
            if ("RAVI".equals(map.getValue()))
                System.out.println("Key " + map.getKey());
            else
                System.out.println("NOT GET");

        }

        System.out.println("getting 6 key value " + hashmap.get("6"));
        System.out.println("ContainsKey  " + hashmap.containsKey("5"));
        System.out.println("ContainsValue  " + hashmap.containsValue("GOVINDA"));
        System.out.println("values " + hashmap.values());
        System.out.println("hashmap.keySet() " + hashmap.keySet());

        // hashtable: it is synchronized, not allow duplicates also No null as
        // KEy and Value
        // keys/value

        // hashtable.putAll(hashmap);
        hashtable.put("4", "MOHIT");
        hashtable.put("7", "SAIRAM");
        hashtable.put("5", "SIVAYA");
        hashtable.put("6", "GOVINDA");
        hashtable.put("7", "GOVINDA");
        hashtable.put("", "XYZ");
        // hashtable.put("RAVI", null);

        // hashtable.put("10", null);
        hashtable.put("4", "MOHIT2");
        System.out.println("hashtable   == " + hashtable.contains("SIVAYA"));
        System.out.println("hashtable   == " + hashtable);

        // linkedhashmap: insertion ordered

        linkedHashMap.put("1", "RAVI");
        linkedHashMap.put("2", "RAJA");
        linkedHashMap.put("3", "SUSMI");
        linkedHashMap.put("4", "MOHIT");
        linkedHashMap.put("7", "SAIRAM");
        linkedHashMap.put("5", "SIVAYA");
        linkedHashMap.put("6", "GOVINDA");
        linkedHashMap.put(null, "GOVINDA4");

        // System.out.println(linkedHasMap.size());

        System.out.println("linkedHasMap   ==" + linkedHashMap);

        // TreeMap : sorted: No null

        treemap.putAll(hashmap);
        // treemap.put(null,"fhghffhfhs");
        System.out.println("******** treemap  == " + treemap);

        System.out.println("**************************************************");

        TreeMap<Integer, String> tmap = new TreeMap<Integer, String>();

        tmap.put(3, "Veera");
        tmap.put(5, "ravi");
        tmap.put(6, "java");
        tmap.put(4, "Kusuma");
        tmap.put(7, "Ravi");
        tmap.put(9, "ram");
        tmap.put(10, "raju");
        tmap.put(2, "j2ee");

        System.out.println("TreeMap ********** " + tmap);

        System.out.println(tmap.subMap(0, true, 7, true));

        System.out.println("==================================");

        EmployeeSet ravi = new EmployeeSet(101, "Ravi", 2546235);

    }
}
