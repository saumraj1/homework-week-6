package homeworkweek6;

import java.util.Locale;
import java.util.Scanner;

//Write a program to convert the upper case to lower case.
public class UpperLower {
    public static void main(String[] args) {
        lower();
    }
    public static void lower(){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter name in Upper case");

        String name= obj.nextLine();

        String lowername= name.toLowerCase();
        System.out.println(lowername);

    }
}
