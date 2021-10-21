package Assignments;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter your Full Name");
        String Name=s.nextLine();

        Name=" "+ Name;
        int l=Name.length();

        for(int i=0;i<l;i++) {
            if (Name.charAt(i) ==' ')
                System.out.print(Name.charAt(i + 1) + ".");
        }


    }
}