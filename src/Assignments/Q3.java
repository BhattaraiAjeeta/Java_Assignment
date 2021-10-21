package Assignments;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
         byte[] Num= new byte[3];
         int  Total=0;

         for(int i=0;i<3;i++)
         {
             System.out.println("Enter the number");
             Num[i] = s.nextByte();
             Total=Total+Num[i];
         }
        System.out.println("The sum of no is "+Total);
    }
}
