package homeworkweek6;

import com.sun.org.apache.xpath.internal.objects.XString;

//1 Declare two static variables
public class Demo1 {
    static int z = 50; // static variable
    static String name = "LAXMI";

    public static void main(String[] args) {
        myMethod(); //50
    }

    public static void myMethod() {
        System.out.println(z);// access with class name
        System.out.println(name);// access with class name

    }

}
