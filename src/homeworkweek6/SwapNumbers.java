package homeworkweek6;
//. Write a Java program to swap two variables. Write a Java program to swap two variables.
import java.util.Scanner;

public class SwapNumbers {

    public static void main(String[] args) {
        SwapNumbers sn =new SwapNumbers();
        sn.swap();
    }
    public void swap(){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter Number: 1");
        int a =obj.nextInt();
        System.out.println("Enter Number: 2");
        int b =obj.nextInt();
        int c=a ;
        a=b;
        b=c;
        System.out.println(a);
        System.out.println(b);
    }
}
