package javaweek7_humaira;

import java.util.Scanner;

/*
20. Write a Java program to test if an array contains a specific value.
 */
public class Program20 {
    int[] myArray = {55, 45, 69, 44, 198, 47,589,423,658,127,444,532,986,155};
    int num;
    boolean found;

    public static void main(String[] args) {
        Program20 obj = new Program20();
        Scanner read = new Scanner(System.in);
        System.out.print("Enter a number to check if Array contains this number:");
        obj.num = read.nextInt();
        obj.myMethod();

    }

    public void myMethod() {
        for (int i = 0; i < myArray.length; i++) {
            if (num == myArray[i])
            {found = true;
            break;}
        }
        if (found) {
            System.out.println("Array contains the given number");
        } else {
            System.out.println("Array does not contain the given number");
        }
    }
}



