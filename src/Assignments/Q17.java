package Assignments;

import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the rows that you want to print the pattern");
        int r = s.nextInt();
        for (int i = 1; i <= r; i++)
        {
           for(int j=r;j>i;j--)
           {
               System.out.print(" ");
           }
            for(int k=1;k<=(i*2)-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}