package homeworkweek6;

public class AreaPerimeter {
    public static void main(String[] args) {
      calPerimeter();

    }

    public static void calPerimeter(){
        final  double width =5.6;
        final  double height =8.5;
        double perimeter = 2*(height + width);
        double area = width * height;
        System.out.printf("Area is %.1f * %.1f = %.2f \n ",width,height,area );
        System.out.printf("Perimeter is 2*(%.1f + %.1f)= %.2f \n", width, height, perimeter);

    }
}
