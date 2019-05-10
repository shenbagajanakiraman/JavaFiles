/* Program to explain the use of Iterators in collections */

package com.stackroute.javahackathon;

import java.util.*;

class Student {
    private int id;
    private String name;
    private int age;

    // Constructor

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Getters

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {

        return age;
    }

    @Override
    public String toString() {
        String str = +id + " " + name + " " + age;
        return str;
    }

}



    public class IteratorDemo {
    public static void main(String[] args) {

        ArrayList<Student> studentList = new ArrayList<>();

        Student student1 = new Student(1,"Reshma",23);
        studentList.add(student1);

        Student student2 = new Student(2,"Arjun",25);
        studentList.add(student2);

        Student student3 = new Student(3,"Gokul",21);
        studentList.add(student3);

        Student student4 = new Student(4,"Praba",22);
        studentList.add(student4);

        Student student5 = new Student(5,"Rahul",24);
        studentList.add(student5);

        System.out.println("\nOverriding 'toString() method' and printing the ArrayList");
        System.out.println(studentList.toString());


        System.out.println("\nPrinting using Iterator");

        Iterator studIterator = studentList.iterator();

        while (studIterator.hasNext()) {
            System.out.println(studIterator.next());

        }

//        System.out.println("\nPrinting using foreach loop");
//        // Using foreach loop
//        studentList.forEach(System.out::println);


        }
    }
