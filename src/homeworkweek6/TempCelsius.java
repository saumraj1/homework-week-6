package homeworkweek6;

import java.util.Scanner;

//Write a program to insert any temperature value in degree Fahrenheit and
//convert to degree Celsius ((F − 32) × 5/9 = 0°C).
public class TempCelsius {
    public static void main(String[] args) {
        temp();

    }

   public static void temp(){
        double Celsius;
        Scanner obj = new Scanner(System.in);

       System.out.println("Enter the temp.value in Fahrenheit");
       double Fahrenheit =obj.nextDouble();

       Celsius = ((Fahrenheit - 32 ) * 5 ) /9;

       System.out.println("temp in celsius is:"+Celsius );


   }
}
