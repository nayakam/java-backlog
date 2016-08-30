package com.nayakam.practice;

import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {
        System.out.println("Tree Set Example!\n");
        TreeSet<Integer> tree = new TreeSet<Integer>();
        tree.add(12);
        tree.add(63);
        tree.add(70);
        tree.add(34);
        tree.add(45);

        System.out.println("DescendingSet: " + tree.descendingSet());

        // here it test it's sorted, 63 is the last element. see output below
        Iterator<Integer> iterator = tree.iterator();
        System.out.print("Tree set data: ");

        // Displaying the Tree set data
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // Check empty or not
        if (tree.isEmpty()) {
            System.out.print("Tree Set is empty.");
        } else {
            System.out.println("Tree Set size: " + tree.size());
        }


        System.out.println("ceiling for 34: " + tree.ceiling(34));
        System.out.println("floor for 34: " + tree.floor(34));
        System.out.println("ceiling for 50: " + tree.ceiling(50));
        System.out.println("floor for 50: " + tree.floor(50));

        System.out.println("lower for 34: " + tree.lower(34));
        System.out.println("higher for 34: " + tree.higher(34));

        System.out.println("lower for 50: " + tree.lower(50));
        System.out.println("higher for 50: " + tree.higher(50));


        // Retrieve first data from tree set
        System.out.println("First data: " + tree.first());
        System.out.println("pollFirst data: " + tree.pollFirst());

        // Retrieve last data from tree set
        System.out.println("Last data: " + tree.last());
        System.out.println("pollLast data: " + tree.pollLast());


        System.out.println("Data is removed from tree set :" + tree.remove(45));
        System.out.println("Data is removed from tree set :" + tree.remove(15));

        System.out.print("Now the tree set contain: " + tree);

        System.out.println("Now the size of tree set: " + tree.size());

        // Remove all
        tree.clear();
        if (tree.isEmpty()) {
            System.out.print("Tree Set is empty.");
        } else {
            System.out.println("Tree Set size: " + tree.size());
        }


        TreeMap<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();

    }
}