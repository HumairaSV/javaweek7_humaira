package javaweek7_humaira;

import java.util.Scanner;

/*
7. Write a java program input sales id, seller's name, sales amount, and salary basic and then find the sales
Commission
Sales amount >= 50,000 35%
Sales amount >= 30,000 20%
Sales amount >= 20,000 10%
Sales amount >= 10,000 5%
Sales amount < 10,000 2%
 */
public class Program7 {
    int salesId;
    String name;
    double saleamt;
    int salary;
    double salecomm;
    double grossinc;

    public static void main(String[] args) {
        Program7 obj = new Program7();
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the Seller's name: ");
        obj.name = read.nextLine();
        System.out.print("Enter the Sales ID: ");
        obj.salesId = read.nextInt();
        System.out.print("Enter the Sales amount: ");
        obj.saleamt = read.nextDouble();
        System.out.print("Enter the basic salary: ");
        obj.salary = read.nextInt();
        obj.myCalc();
        obj.printComm();
        read.close();

    }

    public void myCalc() {
        if (saleamt >= 50000) {
            salecomm = salary * 0.35;
        } else if (saleamt < 50000 && saleamt >= 30000) {
            salecomm = salary * 0.2;
        } else if (saleamt < 30000 && saleamt >= 20000) {
            salecomm = salary * 0.1;
        } else if (saleamt < 20000 && saleamt >= 10000) {
            salecomm = salary * 0.05;
        } else {
            salecomm = salary * 0.02;
        }
        grossinc = salecomm + salary;

    }

    public void printComm() {
        System.out.println("Sales ID         : " + salesId);
        System.out.println("Seller's Name    : " + name);
        System.out.println("Sales amount     : " + saleamt);
        System.out.println("Basic Salary     : " + salary);
        System.out.println("Commission earned: " + salecomm);
        System.out.println("Gross Salary     : " + grossinc);

    }
}


