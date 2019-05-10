
// Java program to demonstrate working of Dequeue

package com.stackroute.javahackathon;

import java.util.*;

public class DeQueueDemo {

  public static void main(String[] args)
    {
        /* Dequeue can be implemented using... LinkedList, ArrayDequeue,(PriorityQueue?)*/
        Deque<String> deque = new LinkedList<>() ;

        // We can add elements to the queue in various ways



        deque.add("add"); // Always adds to tail
        deque.addFirst("add first");
        deque.addLast("add last");
        deque.push("push"); //Always adds to head
        deque.add("Add2");
        deque.push("push2");

        //Adds an element to the head and returns a boolean to explain if the insertion was successful
        deque.offerFirst("offer first");

        //Adds an element to the head and returns a boolean to explain if the insertion was successful
        deque.offerLast("offer last");


        System.out.println(deque + "\n");

        // Iterate through the queue elements.
        System.out.println("Standard Iterator");
        Iterator iterator = deque.iterator();
        while (iterator.hasNext())
            System.out.println("\t" + iterator.next());



        /*
         Peek returns the head, without deleting
         it from the deque
        */
        System.out.println("Peek element: " + deque.peek());
        System.out.println("After peek: " + deque);

        /*
         Pop returns the head, and removes it from
         the deque
        */
        System.out.println("Pop element" + deque.pop());
        System.out.println("After pop: " + deque);

        /*
         We can check if a specific element exists
         in the deque
        */
        System.out.println("Contains element : " +
                deque.contains("push"));

        /* We can remove the first / last element. */
        deque.removeFirst();
        deque.removeLast();
        System.out.println("Deque after removing " +
                "first and last: " + deque);

    }
}
