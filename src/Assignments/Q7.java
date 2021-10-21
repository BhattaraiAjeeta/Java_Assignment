package Assignments;

import java.util.Scanner;

public class Q7
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);


        System.out.println("Enter the Number");
        int Num= s.nextInt();

        boolean flag = false;

        for (int i = 2; i <= Num / 2; i++) {
            // condition for nonprime number
            if (Num % i == 0) {
                flag = true;
                break;
            }
        }

        if (flag)
            System.out.println(Num + " is a not a prime number.");
        else
            System.out.println(Num + " is  a prime number.");

    }
}
