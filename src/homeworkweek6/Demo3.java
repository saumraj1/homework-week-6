package homeworkweek6;
//4.1 Declare two instance and two static variables.
public class Demo3 {
    int x= 10;
    int y=20;
    static String name = "Raj";
    static String name1 = "Sam";

    public static void main(String[] args) {
        Demo3 obj1 = new Demo3();
        xyz1();
        obj1.xyz();

    }
    public void xyz(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(name);
        System.out.println(name1);
    }
    public static void xyz1(){
        Demo3 obj = new Demo3();
        System.out.println(obj.x);
        System.out.println(obj.y);
        System.out.println(name);
        System.out.println(name1);
    }

}
