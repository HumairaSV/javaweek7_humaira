package javaweek7_humaira;

import java.util.Scanner;

/*
 *Write a java program to input student Name, roll No, and three subjects Math, Science and English
 *marks (marks is between 0 to 100 and if it is out of range print error message “Invalid Input, Marks
 * should between 0 to 100”) and find out total, percentage and result.If he is pass or fail on basis
 * of percentage (pass>=35) and also give them grade if %> = 80 A+, %> = 60 A, %> = 50 B, %> = 35 C
 * And print Mark Sheet in following format
 */
public class Program3 {
    static String studentname;
    static int rollno;
    static int math;
    static int science;
    static int english;
    static boolean valid;
    static int total;
    static double percentage;

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter Student Name:");
        studentname = read.nextLine();
        System.out.print("Enter Roll No: ");
        rollno = read.nextInt();
        System.out.print("Enter marks for Math: ");
        math = read.nextInt();
        valid = validateMarks(math);
        System.out.print("Enter marks for Science: ");
        science = read.nextInt();
        validateMarks(science);
        System.out.print("Enter marks for English: ");
        english = read.nextInt();
        validateMarks(english);
        total = (math + science + english);
        percentage= total*100/300;
        printResult();
        read.close();
    }

    public static boolean validateMarks(int marks) {
        if (marks < 1 || marks > 100) {
            System.out.println("Invalid Input, Marks should between 0 to 100");
            return false;
        }
        return true;
    }
    public static String grade() {
        if(math<35 || science <35 || english <35){
            return "Fail";
        }else if (percentage >= 80) {
            return "A+";
        } else if (percentage < 80 && percentage >= 60) {
            return "A";
        } else if (percentage < 60 && percentage >= 50) {
            return "B";
        } else if (percentage < 50 && percentage >= 35) {
            return "C";
        } else {
            return "Fail";
        }

    }

    public static void printResult(){
        String result;
        if(grade() == "Fail"){
            result = "Fail";
        }else{
            result = "Pass";
        }
        System.out.println("|------------------------|");
        System.out.println("|      Mark Sheet        |");
        System.out.println("|________________________|");
        System.out.println("|  Name   : " + studentname +"      |");
        System.out.println("|  Roll No: " + rollno + "           |");
        System.out.println("|________________________|");
        System.out.println("|  Subjects  : Marks     |");
        System.out.println("|________________________|");
        System.out.println("|  Math      : " + math + "        |");
        System.out.println("|  Science   : " + science + "        |");
        System.out.println("|  English   : " + english + "        |");
        System.out.println("|________________________|");
        System.out.println("|  Total     : " + total + "       |");
        System.out.println("|________________________|");
        System.out.println("|  Percentage: " + percentage + "      |");
        System.out.println("|  Result    : " + result + "      |");
        System.out.println("|  Grade     : " + grade() + "         |");
        System.out.println("|________________________|");
    }
}

