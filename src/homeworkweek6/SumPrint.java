package homeworkweek6;
//18. Write a Java program to print the sum (addition), multiply, subtract, divide and
//remainder of two numbers

import java.util.Scanner;

public class SumPrint {
    int a = 125;
    int b = 24;

    public static void main(String[] args) {

        multiplication();
        division();
        SumPrint obj1 = new SumPrint();
        obj1.addition();
        obj1.subtraction();
        obj1.remainder();
    }

    public void addition() {
        System.out.println(a+" + " +b+ " = "+ (a + b));
    }

    public void subtraction() {
        System.out.println(a+" - " +b+ " = "+ (a - b));
    }
    public void remainder() {
        System.out.println(a+" % " +b+ " = "+ (a % b));
    }
    public static void multiplication() {
        SumPrint sp = new SumPrint();
        System.out.println(sp.a+" * " +sp.b+ " = "+ (sp.a * sp.b));
    }

    public static void division() {
        SumPrint sp = new SumPrint();
        System.out.println(sp.a+" / " +sp.b+ " = "+ (sp.a / sp.b));
    }

}



