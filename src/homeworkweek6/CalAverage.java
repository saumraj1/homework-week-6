package homeworkweek6;

import java.util.Scanner;

//13. Write a Java program that takes three numbers as input to calculate and
//print the average of the numbers.
public class CalAverage {
    public static void main(String[] args) {

        Scanner ave = new Scanner(System.in);
        System.out.println("Input the first number :");
        double x=ave.nextDouble();

        System.out.println("Input the second number :");
        double y=ave.nextDouble();

        System.out.println("Input the third number :");
        double z=ave.nextDouble();

        System.out.println("The average value is :"+aveclu(x,y,z)+"\n");

    }
    public static double aveclu(double x ,double y, double z){
        return (x + y + z)/3;
    }

}
