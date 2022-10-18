package javaweek7_humaira;

import java.util.Scanner;

/*
12. Write a program that tells us input value is number or an alphabet or symbol.
 */
public class Program12 {
    char val;

    public static void main(String[] args) {
        Program12 obj = new Program12();
        Scanner read = new Scanner(System.in);
        System.out.print("Enter a value: ");
        obj.val = read.next().charAt(0);
        obj.checkInput();
        read.close();

    }
    public void checkInput(){
        if((val>= 'a' && val<= 'z') || (val>= 'A' && val<= 'Z')){
            System.out.println(" Input is an alphabet");
        }else if(val>= '0' && val<= '9') {
            System.out.println("Input is a number");
        }else {
            System.out.println("Input is a symbol");
        }

    }
}
