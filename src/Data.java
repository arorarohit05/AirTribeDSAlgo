// Learning collections and Map

import java.util.*;
import java.util.LinkedList;

// Iterable -> collection -> data structures list/set/queue

// Iterable -> Anything that can be looped using foreach loop
// Collection -> Root interface for all data structures  // container that will hold my objects
//


// List (data - order maintained, duplicates allowed 5 5 )
// ArrayList -> dynamic array [store many elements , no fix size] - you should use when u want faster access
// LinkedList -> faster insertion and deletion
// Vector
//     // Stack


// Set - duplicates are not allowed - only unique values
// HashSet - faster search
//      LinkedHashSet - maintain order

// Sorted Set
//     navigable set
//            Treeset

// Queue   - FIFO
// PriorityQueue class - using some priority [heap]
// Deque interface
//          ArrayDeque
//         LinkedList


// parent class reference can refer to a child class object

// class Person{
//   String name;
//   String phoneno;
// }

// list  ->   [ rohit  ,  983783]   ,  [ mohit,23768324 ] , [ ],,... 100  // hashing
 //--------------------------


//Map Interface
// [ name -> phoneno]
// map ->     rohit q3898
//            mohit 2877

// Map
//   HashMap -> array + hashing + kv pair
//       LinkedHashMap

//  SortedMap
//     Navigablemap
//          TreeMap

// HashTable

public class Data {


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(20);

        System.out.println(list.get(2));
        System.out.println();

        list.remove(2);

        for(Integer a : list){
            System.out.println(a);
        }

        System.out.println("LinkedList");
        //

        List<Integer> listb = new LinkedList<>();
        listb.add(200);
        listb.add(300);
        listb.add(400);
        listb.add(500);
        listb.add(200);

        for(Integer a : listb){
            System.out.println(a);
        }

        //
        // Vector - thread safe , slower

        //
        Stack<Integer> stack = new Stack<>();
        stack.push(20);
        stack.push(90);
        stack.push(900);
        stack.push(20000);

        System.out.println(stack.pop());


        //
        System.out.println("SET");
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20); // ignore

        set.remove(10);

        set.contains(10); // O(1)

        for(int a : set){
            System.out.println(a);
        }

        // LinkedHashSet - DLL
        // Tree Set - red black tree [sorted output]
System.out.println("TREESET");
        TreeSet<Integer> setb = new TreeSet<>();

        setb.add(50);
        setb.add(70);
        setb.add(10);
        setb.add(500);
        setb.add(60);
        setb.add(50);// ignore

        for(int a : setb){
            System.out.println(a);
        }


        PriorityQueue<Integer> pq = new PriorityQueue<>(); // Priority

        ArrayDeque<Integer> ad = new ArrayDeque<>(); // doubly ended queue
        Queue<Integer> queue = new LinkedList<>(); // normal queue  Single ended queue




        //
        Map<String,Integer> hm = new HashMap<>(); // no order is mantained
        hm.put("Rohit",90);
        hm.put("Mohit", 100);

        hm.put(null,100);

        System.out.println(hm.get("Mohit"));

        for(Map.Entry<String,Integer> e: hm.entrySet()){
            System.out.println(e.getKey() +  " "+ e.getValue());
        }

        //LinkedHashMap - maintain insertion order

        TreeMap<String,Integer> tm = new TreeMap<>(); // red black tree // sorted order
        tm.put("Rohit",80);
        tm.put("Mohit",800);
        tm.put("Kohit",8000);
        tm.put("Aohit",80000);
        tm.put("Bohit",800000);


        for(Map.Entry<String,Integer> e: tm.entrySet()){
            System.out.println(e.getKey() +  " "+ e.getValue());
        }

        Hashtable<Integer,Integer> ht = new Hashtable<>();
        // Thread safe, slower

        ht.put(null,43);

        for(Map.Entry<Integer,Integer> e: ht.entrySet()){
            System.out.println(e.getKey() +  " "+ e.getValue());
        }

        // Hashmap       Hastable
        // not thread safe   thread safe
        //  NULL key          not allowed
    }

}
