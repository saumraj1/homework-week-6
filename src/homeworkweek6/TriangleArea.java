package homeworkweek6;
//Write a program to calculate the area of a triangle.
import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        cal();

    }
    public static void cal(){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Height");
        float h=obj.nextFloat();

        System.out.println("Enter Base");
        float b=obj.nextFloat();

        float area = (b*h)/2;
        System.out.println("Area of Triangle :" +area);


    }
}
