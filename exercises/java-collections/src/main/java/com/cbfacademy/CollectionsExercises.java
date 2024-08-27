package com.cbfacademy;

import java.util.*;

public class CollectionsExercises {

    public LinkedList<Integer> useLinkedList() {
        LinkedList<Integer> integers = new LinkedList<>();

        integers.add(4);
        integers.add(5);
        integers.add(6);
        integers.add(8);
        integers.add(2);
        integers.add(9);
        integers.add(2);
        integers.add(2,4);

        System.out.print(integers.element());
        return integers;
        

            

        
        //throw new RuntimeException("Not implemented");
    }

    

    public Stack<Integer> useStack() {

        //throw new RuntimeException("Not implemented");
        Stack<Integer> integers = new Stack<>();
        integers.push(5);
        integers.push(6);
        integers.push(8);
        integers.push(9);
        System.out.print(integers.get(0));
        System.out.print(integers.get(3));
        System.out.print(integers.pop());
        integers.push(4);
        return integers;

    }

    public ArrayDeque<Integer> useArrayDeque() {
        ArrayDeque<Integer> integers = new ArrayDeque<>();

        integers.add(5);
        integers.add(6);
        integers.add(8);
        integers.add(9);
        System.out.print(integers.peek());
        System.out.print(integers.peekLast());
        System.out.print(integers.poll());
        System.out.print(integers.element());
        //throw new RuntimeException("Not implemented");
        return integers;
    }

    public HashMap<Integer, String> useHashMap() {
        HashMap<Integer, String> languages = new HashMap<>();

        //throw new RuntimeException("Not implemented");
        languages.put(1,"Typescript");
        languages.put(2,"Kotlin");
        languages.put(3,"Python");
        languages.put(4,"Java");
        languages.put(5,"JavaScript");
        languages.put(6,"Rust");
        System.out.print(languages.keySet());
        System.out.print(languages.values());
        System.out.print(languages.containsValue("English"));
        return languages;
    }

    public String getName() {
        return "Collections Exercises";
    }
}
