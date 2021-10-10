package homeworkweek6;
//1 Declare one instance and one static variable.
public class Demo2 {
    int a= 30;
    static int ab=20;
    public static void main(String[] args) {
        Demo2 obj2 = new Demo2();
        obj2.instancePrint();
        staticPrint();

    }
    public void instancePrint(){

        System.out.println(a);
        System.out.println(ab);
    }
    public static void staticPrint(){
        Demo2 obj1 = new Demo2();
        System.out.println(ab);
        System.out.println(obj1.a);
    }
}
