package homeworkweek6;

import java.util.Scanner;

//Write a program to enter any radius value of the circle and find out the
//area.(Formula of Area A=PI*r*r)
public class Circle {

    public static void main(String[] args) {
        double pi = 3.14;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter value");
        int r= obj.nextInt();
        System.out.println("Area  is "+(pi*r*r));




    }
}
