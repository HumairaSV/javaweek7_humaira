package javaweek7_humaira;

import java.util.Arrays;

/*
18. Write a Java program to sum values of an array.
 */
public class Program18 {
    int a;
    public static void main(String[] args) {
        sumArray();

    }
    public static void sumArray(){
        int a[] = {5,8,9,11,58,99};
        int sum = 0;
        for(int i =0; i<a.length; i++){
            sum= sum + a[i];
        }
        System.out.println("Numbers in the array: " + Arrays.toString(a));
        System.out.println("Sum of the numbers in array: " + sum);
    }
}
