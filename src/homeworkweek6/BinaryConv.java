package homeworkweek6;
//7. Write a Java program to convert a decimal number to binary number.
import java.util.Scanner;

public class BinaryConv {
    double num;
    public static void main(String[] args) {
        BinaryConv bc = new BinaryConv();
        bc.conbinary();

    }
    public void conbinary  (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");

        num=sc.nextDouble();
        System.out.println(Integer.toBinaryString((int)num));

    }
}
