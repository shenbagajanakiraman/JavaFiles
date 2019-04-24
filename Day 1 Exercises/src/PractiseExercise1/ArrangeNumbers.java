package PractiseExercise1;

import java.util.Scanner;

public class ArrangeNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        int length;
        int temp;

        System.out.println("Enter a large number :");
        number = input.nextInt();

        int len = Integer.toString(number).length();
        int[] numArray = new int[len];
        int k=0;
        int len1;
        int sum = 0;

        len1 = len;

        while(len>0) {
            numArray[k] = number % 10;
            number = number / 10;

            if ((numArray[k] % 2) == 0) {
                sum = sum + numArray[k];
            }
            k++;
            len--;
        }

        len = len1;

        int temp1;
        for (int i = 1; i < len; i++) {
            for (int j = i; j > 0; j--) {
                if (numArray[j] > numArray[j - 1]) {
                    temp1 = numArray[j];
                    numArray[j] = numArray[j - 1];
                    numArray[j - 1] = temp1;
                }
            }
        }

        k=0;

        System.out.print("Sorted number in non-increasing order: ");

        while(len>0) {
            System.out.print(numArray[k]);
            len--;
            k++;
        }

        System.out.println("");
        System.out.println("The Sum is ... "+sum);
        if(sum > 15) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }




    }


}




