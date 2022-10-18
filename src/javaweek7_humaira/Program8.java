package javaweek7_humaira;

import java.util.Objects;
import java.util.Scanner;

/*
8. Input any alphabet from “A" to “F” and print
their city name accordingly (use if else) if any other alphabet should be invalid entry
 */
public class Program8 {
    static String b;

    public static void main(String[] args) {
        System.out.println("_________________________");
        System.out.println("Print City Names (A to F)");
        System.out.println("_________________________");
        Scanner a = new Scanner(System.in);
        System.out.print("Enter an alphabet from A to F : ");
        b = a.nextLine();
        Program8 obj = new Program8();
        obj.cityName();
        a.close();

    }

    public void cityName() {
        if ((Objects.equals(b, "A")) || (Objects.equals(b, "a"))) {
            System.out.println("Ahmedabad");
        } else if ((Objects.equals(b, "B")) || (Objects.equals(b, "b"))) {
            System.out.println("Baroda");
        } else if ((Objects.equals(b, "C")) || (Objects.equals(b, "c"))) {
            System.out.println("Chennai");
        } else if ((Objects.equals(b, "D")) || (Objects.equals(b, "d"))) {
            System.out.println("Delhi");
        } else if ((Objects.equals(b, "E")) || (Objects.equals(b, "e"))) {
            System.out.println("Exeter");
        } else if ((Objects.equals(b, "F")) || (Objects.equals(b, "f"))) {
            System.out.println("Failsworth");
        } else {
            System.out.println("This is an invalid entry!");
        }
    }
}
