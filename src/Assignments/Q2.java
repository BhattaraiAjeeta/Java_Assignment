package Assignments;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("Enter the UserId");
        byte UserId = s.nextByte();

        System.out.println("Enter Name");
        s.nextLine();
        String Name= s.nextLine();
       // s.nextLine();
        System.out.println("Enter email_id");
        String Email=s.nextLine();
       // s.nextLine();
        System.out.println("Enter the address");
        String Address=s.nextLine();

        System.out.println("User Id:" +UserId);
        System.out.println("Name:" +Name);
        System.out.println("Email:" +Email);
        System.out.println("Address:" +Address);


    }

}
