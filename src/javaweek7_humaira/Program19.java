package javaweek7_humaira;

import java.util.Arrays;

/*
19. Write a Java program to calculate the average value of array elements.

 */
public class Program19 {
    double avg;
    int []x = {2,55,48,45,3,9,7,66,21};
    public static void main(String[] args) {
        Program19 a = new Program19();
        a.myAvgCalc();
        a.printOut();

    }
    public void myAvgCalc(){
        int sum = 0;
        for (int i = 0; i < x.length; i++){
            sum = sum + x[i];
            avg = sum/ x.length;

        }
    }
    public void printOut(){
        System.out.println("Numbers in array" + Arrays.toString(x));
        System.out.println("Average value of array elements: " + avg);
    }
}
