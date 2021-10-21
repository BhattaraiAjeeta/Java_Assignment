package Assignments;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the First Name");
        String Name1=s.nextLine();
        System.out.println("Enter the Second Name");
        String Name2=s.nextLine();

        if(Name1.equals(Name2))
            System.out.println("They are same names");

        else
             System.out.println("They are not same names");
    }
}
