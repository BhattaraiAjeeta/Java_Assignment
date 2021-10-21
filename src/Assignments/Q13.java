package Assignments;

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the sentence");
        String Text=s.nextLine();
        System.out.println("Enter the part to look for");
        String Part=s.nextLine();
        if(Text.contains(Part)){
            System.out.print("Found the part:   "+Part +"\n"+ " In the sentence:   "+Text);}
        else{
            System.out.println(" Not found the part :   "+Part +"\n"+"In the sentence:   "+Text);
        }
    }
}
