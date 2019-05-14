
/* Java program to demonstrate working of Dequeue */

package com.stackroute.javahackathon;

import java.util.Stack;

public class StackDemo {

    public static void main(String args[])
    {
        // Creating an empty Stack
        Stack<String> myStack = new Stack<>();

        // Use push() to add elements into the Stack
        myStack.push("Have");
        myStack.push("A");
        myStack.push("Wonderful");
        myStack.push("Day");
        myStack.push("Smile :)");


        // Displaying the Stack
        System.out.println("Initial Stack: " + myStack);

        // Fetching the element at the head of the Stack
        System.out.println("\nThe element at the top of the"
                + " stack is: " + myStack.peek());


        // Searches if the element is present
        System.out.println("Index of 'Day'"+myStack.search("Day"));

        //Fetches the first element
        System.out.println("Peek : "+myStack.peek());

        //Fetches the First element and deletes it
        System.out.println("Pop : "+myStack.pop());


        //Checks the Stack is empty
        System.out.println(myStack.empty());

        // Displaying the Stack after the Operation
        System.out.println("Final Stack: " + myStack);
    }
}