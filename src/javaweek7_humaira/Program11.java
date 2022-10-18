package javaweek7_humaira;
/*
11. Write a java program to print the numbers between 1 to 100 which can be divided by 3 and 5 separately.
 */
public class Program11 {
    static int x;

    public static void main(String[] args) {
        nosDivByThree();
        nosDivByFive();

    }
    public static void nosDivByThree(){
        System.out.println("Nos divisible by 3 are: ");
        for(int i=1; i<100; i++){
            if(i%3 ==0)
                System.out.println(i +", ");

        }
    }

    public static void nosDivByFive(){
        System.out.println("Nos divisible by 5 are: ");
        for(int i=1; i<100; i++){
            if(i%5 == 0)
                System.out.println(i + ", ");
        }
    }
}
