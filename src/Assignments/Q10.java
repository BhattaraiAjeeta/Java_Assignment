package Assignments;

import java.util.Locale;
import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter your Full Name ");
        String Name = s.nextLine();

        Name = Name;
        int pos = Name.indexOf(' ');
        int pos1 = Name.indexOf(Name);
       // int l=Name.length();
       //  Name=Name.toLowerCase();

        System.out.print((Name.substring(pos1)).toLowerCase());
       System.out.print((Name.substring(pos)).toUpperCase());
}
}