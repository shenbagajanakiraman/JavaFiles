package PractiseExercise1;

import java.util.Scanner;

public class AddingInteger {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean flag = true;

        System.out.println("Enter a few numbers ( End it with 0) : ");

        double number;
        int sum = 0;
        while ((number = input.nextDouble()) != 0) {
            if (number == (int) number) {
                sum = sum + (int)number;
            }

            else {
                System.out.println("Error "+number+ " is not an integer");
                flag = false;
                break;
            }



            }

           if (flag == true) {
               System.out.println("The Sum is ..."+sum);
        }
    }
}
