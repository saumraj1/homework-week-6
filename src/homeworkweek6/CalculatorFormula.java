package homeworkweek6;

import java.util.Scanner;

public class CalculatorFormula {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter no. 1");
        int a=obj.nextInt();
        System.out.println("Enter value less than no. 1");
        int b=obj.nextInt();
        multiplication(a,b);
        division(a,b);
        CalculatorFormula obj1 = new CalculatorFormula();
        obj1.addition(a,b);
        obj1.subtraction(a,b);
    }
    public void addition(int a, int b){
        System.out.println("Addition : "+(a+b));
    }
    public void subtraction(int a, int b){
        System.out.println("Subtraction : "+(a-b));
    }
    public static void multiplication(int a, int b){
        System.out.println("Multiplication : "+(a*b));
    }
    public static void division(int a,int b){
        System.out.println("Division : "+(a/b));
    }

}
