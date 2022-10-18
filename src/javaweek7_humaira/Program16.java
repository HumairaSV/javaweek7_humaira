package javaweek7_humaira;

import java.util.Scanner;

/*
16. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or “ZERO”
 */
public class Program16 {
    int a;

    public static void main(String[] args) {
        Program16 obj = new Program16();
        Scanner nos = new Scanner(System.in);
        System.out.print("Enter a number: ");
        obj.a = nos.nextInt();
        obj.checkNumber();
        nos.close();
    }
    public void checkNumber(){
        if(a<0){
            System.out.println("Input number is Negative");
        }else if (a>0){
            System.out.println("Input number is Positive");
        }else{
            System.out.println("Input number is Zero");
        }


    }
}
