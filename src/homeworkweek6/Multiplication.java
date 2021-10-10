package homeworkweek6;
//Write a Java program that takes a number as input and prints its
//multiplication table up to 10.
//Test Data: Input a number: 8
import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the number :");
        int num1 = in.nextInt();
        System.out.println(num1+" X 1 ="+num1*1);
        System.out.println(num1+" X 2 ="+num1*2);
        System.out.println(num1+" X 3 ="+num1*3);
        System.out.println(num1+" X 4 ="+num1*4);
        System.out.println(num1+" X 5 ="+num1*5);
        System.out.println(num1+" X 6 ="+num1*6);
        System.out.println(num1+" X 7 ="+num1*7);
        System.out.println(num1+" X 8 ="+num1*8);
        System.out.println(num1+" X 9 ="+num1*9);
        System.out.println(num1+" X 10 ="+num1*10);
    }
}
