package Assignments;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the first number a");
        int a = s.nextInt();
        System.out.println("enter the first number b");
        int b = s.nextInt();
        System.out.println("enter the test from(1-5)");
        int T = s.nextInt();
        switch (T) {
            case 1:
                System.out.println("Result is "+(a+b) );
                break;
            case 2:
                System.out.println("Result is "+(a-b));
                break;
            case 3:
                System.out.println("Result is "+(a*b));
                break;
            case 4:
                System.out.println("Result is "+(a/b));
                break;
            case 5:
                System.out.println("Quit");
                break;
        }
    }
}