package Assignments;
import java.lang.*;
import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter your Full Name");
        String Name = s.nextLine();
        String initial = "";


        Name = " " + Name;
        int l = Name.length();

        for (int i = 0; i < l; i++) {
            if (Name.charAt(i) == ' ')
                initial = initial + (Name.charAt(i + 1) + ".");
        }

        StringBuilder rev = new StringBuilder(initial);

        rev = rev.reverse();
        System.out.println(rev);

    }

}
