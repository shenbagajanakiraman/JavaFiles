
/* Java program to demonstrate working of Dequeue */

package com.stackroute.javahackathon;

import java.util.Stack;

public class StackDemo {

    public static void main(String args[])
    {
        // Creating an empty Stack
        Stack<String> myStack = new Stack<String>();

        // Use push() to add elements into the Stack
        myStack.push("Have");
        myStack.push("A");
        myStack.push("Wonderful");
        myStack.push("Day");
        myStack.push("Smile :)");


        // Displaying the Stack
        System.out.println("Initial Stack: " + myStack);

        // Fetching the element at the head of the Stack
        System.out.println("The element at the top of the"
                + " stack is: " + myStack.peek());

        // Displaying the Stack after the Operation
        System.out.println("Final Stack: " + myStack);

        System.out.println(myStack.search("Day"));
        System.out.println(myStack.peek());
        System.out.println(myStack.pop());
        System.out.println(myStack);

        System.out.println(myStack.empty());
    }
}