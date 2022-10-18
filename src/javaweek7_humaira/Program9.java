package javaweek7_humaira;

import java.util.Scanner;

/*
9. Same as above program-8 using switch statement.
Input any alphabet from “A" to “F” and print their city name accordingly
 if any other alphabet should be invalid entry
 */
public class Program9 {
    static String city;
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.print("Enter an alphabet from A to F : ");
        city = read.nextLine();
        cityName();

    }
    public static void cityName(){
        switch(city){
            case "A":
            case "a":
                System.out.println("Ahmedabad");
                break;
            case "B":
            case "b":
                System.out.println("Bangkok");
                break;
            case "C":
            case "c":
                System.out.println("Cardiff");
                break;
            case "D":
            case "d":
                System.out.println("Denver");
                break;
            case "E":
            case "e":
                System.out.println("Edinburgh");
                break;
            case "F":
            case "f":
                System.out.println("Florence");
                break;
            default:
                System.out.println("This is an invalid entry!");

        }
    }

}
