package javaweek7_humaira;

import java.util.Scanner;

/*
10. Write a java program to input any two number and ask user to enter their symbol
(+, -, /, *) find addition, Subtraction, multiplication and division according to their symbol (using if else)
 */
public class Program10 {
    static double a;
    static double b;
    static char operator;

    public static void main(String[] args) {
        Scanner ops = new Scanner(System.in);
        System.out.print("Enter first number: ");
        a= ops.nextDouble();
        System.out.print("Enter second number: ");
        b= ops.nextDouble();
        System.out.println("Enter the operator( + - / *)");
        operator = ops.next().charAt(0);
        myCalculation();
        ops.close();
    }
    public static void myCalculation(){
        if(operator == '+'){
            addition();
        } else if (operator == '-') {
            subtraction();
        } else if (operator == '*') {
            multiplication();
        }else if (operator == '/'){
            division();
        }else{
            System.out.println("Invalid operator selected!");
        }

    }
    public static void addition(){
        System.out.println(a + " + " + b + " = " + (a+b));
    }

    public static void subtraction(){
        System.out.println(a + " - " + b + " = " + (a-b));
    }

    public static void multiplication(){
        System.out.println(a + " * " + b + " = " + (a*b));
    }

    public static void division(){
        System.out.println(a + " / " + b + " = " + (a/b));
    }
}
