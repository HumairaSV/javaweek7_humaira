package javaweek7_humaira;

import java.util.Arrays;

/*
17. Write a Java program to sort a numeric array and a string array.
 */
public class Program17 {

    public static void main(String[] args) {
        Program17 obj = new Program17();
        obj.myNumArray();
        obj.myStringArray();

    }
    public void myNumArray(){
        int mfa[] = {4,55,12,36,99,65,101,999,325,258,4598};
        System.out.println("Unsorted Numbers: " + Arrays.toString(mfa));
        Arrays.sort(mfa);
        System.out.println("Sorted Numbers:   " + Arrays.toString(mfa));
    }
    public void myStringArray(){
        String msa[] = {"January", "Monday", "December", "Wednesday", "American", "Thursday", "Bangkok"};
        System.out.println("Unsorted Words: " + Arrays.toString(msa));
        Arrays.sort(msa);
        System.out.println("Sorted Words:   "+ Arrays.toString(msa));
    }

}
