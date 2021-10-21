package Assignments;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the First Number a");
        int a=s.nextInt();
        System.out.println("Enter the second Number b");
        int b=s.nextInt();

        a=a-b;
        b=a+b;
        a=b-a;

        System.out.println("After the swap");
        System.out.println("First Number a="+a);
        System.out.println("Second Number b="+b);
    }
}
