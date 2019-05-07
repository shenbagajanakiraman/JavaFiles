/* Program to Store Student marks inside an array and reterive it */

package com.stackroute.pe3;

import java.util.Scanner;

public class StudentMarks {

     int[] stuGrades = new int[3];

    public void setStuGrades(int[] Grades) {
       stuGrades = Grades;

    }

    public void getStuGrades() {
        System.out.print("Marks... ");

        for (int i : stuGrades) {

            System.out.print(" "+i+"  ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numOfStudents;
        int[] grades = new int[3];
        System.out.println("Enter the number of Students: ");
        numOfStudents = input.nextInt();
        StudentMarks student[] = new StudentMarks[numOfStudents];

        for (int i = 0 ; i < numOfStudents; i++) {
            System.out.println("For Student "+(i+1)+" enter the marks...");
            for (int j = 0 ; j < 3; j++) {
                System.out.println("subject " + (j + 1));
                grades[j] = input.nextInt();
                if ((grades[j] < 0) || (grades[j] > 100)) {
                    System.out.println("Please enter a valid grade...");
                    j--;
                }
            }

            student[i] = new StudentMarks();
            student[i].setStuGrades(grades);
        }

        System.out.println("Printing Marks....");

        for (int k = 0 ; k < numOfStudents; k++) {
            System.out.println("Student "+(k+1));
             student[k].getStuGrades();
        }

    }

}
