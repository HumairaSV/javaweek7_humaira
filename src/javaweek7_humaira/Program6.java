package javaweek7_humaira;

import java.util.Scanner;

/*
6. Write a java program to input any number and find out if it’s odd or even
 */
public class Program6 {

    public static void main(String[] args) {
        evenOdd();
    }
    public static void evenOdd(){
        System.out.println("______________________________");
        System.out.println("Check if number is Even or Odd");
        System.out.println("______________________________");
        Scanner a = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int b = a.nextInt();
        a.close();

        if(b%2==0){
            System.out.println(b + " is an even number");
        }else{
            System.out.println(b+ " is an odd number");
        }
    }

}
