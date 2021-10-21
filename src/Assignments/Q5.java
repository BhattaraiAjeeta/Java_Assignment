package Assignments;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Number");
        int Num=s.nextInt();

        if(Num>=0)
        System.out.println("The Number is positive "+Num);
        else
        System.out.println("The Number is negative "+Num);

    }
}
