package homeworkweek6;
//Write a Java program to compute the specified expressions and print the
//output.
//Test Data:
//((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
//Expected Output : 2.138888888888889
public class ThreeCal {
    public static void main(String[] args) {
        ThreeCal cal =new ThreeCal();
        cal.expression();

    }
    public void expression(){
        System.out.println((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
    }
}
