package javaweek7_humaira;
/*
2. Write a java program to input any year like (ex.2007) and find out if it is leap year or not?
 */

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        leapYearCheck();
    }

    public static void leapYearCheck(){
        System.out.println("_________________");
        System.out.println("Leap Year checker");
        System.out.println("_________________");
        Scanner year = new Scanner(System.in);
        System.out.print("Enter a Year: ");
        int input = year.nextInt();
        year.close();

        if(((input%4==0)&&(!(input%100==0) || (input %400==0)))){
            System.out.println(input + " is a Leap Year");

        }else{
            System.out.println(input + " is not a Leap Year");
        }
    }
}
