package javaweek7_humaira;

import java.util.Scanner;

/*
5. WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross salary
HRA = basic salary 10%
DA = Basic salary 8%
TA = Basic salary 9%
PF= Basic salary 20%
Gross salary = basic salary + HRA + TA + DA –PF
Print in the format as per pdf
*/
public class Program5 {
    int empId;
    String name;
    double salary;
    double hra;
    double ta;
    double da;
    double pf;
    double total;


    public static void main(String[] args) {
        Program5 obj = new Program5();
        Scanner read = new Scanner(System.in);
        System.out.println("Enter employee name: ");
        obj.name = read.nextLine();
        System.out.println("Enter employee id: ");
        obj.empId = read.nextInt();
        System.out.println("Enter basic salary: ");
        obj.salary = read.nextInt();
        obj.empDataCalc();
        obj.printSalary();
        read.close();

    }
    public void empDataCalc(){
        hra = salary * 0.1;
        ta = salary * 0.08;
        da = salary* 0.09;
        pf = salary * 0.2;
        total = salary + hra + ta + da - pf;
    }
    public void printSalary(){
        System.out.println("__________________________");
        System.out.println("|       Salary Slip      |");
        System.out.println("__________________________");
        System.out.println("|Employee ID   : " + empId + "    |");
        System.out.println("|Employee Name : " + name + " |");
        System.out.println("__________________________");
        System.out.println("|Basic Salary  : " + salary + " |");
        System.out.println("|HRA 10%       : " + hra + "  |");
        System.out.println("|TA 8%         : " + ta + "  |");
        System.out.println("|DA 9%         : " + da + "  |");
        System.out.println("|PF -20%       : " + pf + "  |");
        System.out.println("__________________________");
        System.out.println("|Gross Salary  : " + total + " |");
    }
}
