package javaweek7_humaira;

import java.util.Scanner;

/*
1. Write a java program that tells us that Input number is odd or even?
HINT: use ternary operator (? :)
 */
public class Program1 {
    public static void main(String[] args) {
        Program1 obj= new Program1();
        obj.evenOrOdd();
    }

    public void evenOrOdd(){
        System.out.println("__________________");
        System.out.println("Even or Odd number");
        System.out.println("__________________");
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        int a = input.nextInt();
        input.close();

        String b = (a %2 ==0) ? " an even" : " an odd";
        System.out.println(a + " is"+ b + " number");

    }
}
