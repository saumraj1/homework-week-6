package homeworkweek6;

import java.util.Scanner;

public class BinaryNumber {
    public static void main(String[] args) {
        Scanner ba = new Scanner(System.in);
        System.out.println("Enter first binary number");
        String b1 = ba.nextLine();
        System.out.println("Enter second binary number");
        String b2 = ba.nextLine();
        String sum=binaryAdd(b1,b2);
        System.out.println("Addition of two binary numbr is :"+sum);
    }

    public static String binaryAdd(String b1, String b2) {
        int bi1=Integer.parseInt(b1,2);
        int bi2=Integer.parseInt(b2,2);
        int sum=bi1+bi2;
        return Integer.toBinaryString(sum);
    }
}
