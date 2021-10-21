package Assignments;

import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {

    Scanner s=new Scanner(System.in);
        System.out.println("Enter the rows that you want to print the pattern");
    int r=s.nextInt();
        for(int i=1;i<=r;i++)
    {
        for (int j=1;j<=i;j++)
        {
            System.out.print(" # ");

        }
        System.out.println();
    }
        for(int i=1;i<=r-1;i++)
        {
            for(int j=r-1;j>=i;j--) {
                System.out.print(" # ");
            }
            System.out.println();
        }

        }
}



