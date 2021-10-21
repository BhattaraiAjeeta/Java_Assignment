package Assignments;

import java.util.Calendar;
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        int C_year = Calendar.getInstance().get(Calendar.YEAR);
        System.out.println("Enter your birth year");
        int B_Year=s.nextInt();

        System.out.println("You are "+(C_year-B_Year)+" year old.");
    }
}
