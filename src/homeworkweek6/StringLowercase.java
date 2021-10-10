package homeworkweek6;
//19. Write a Java program to convert a given string into lowercase.
// Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG

public class StringLowercase {
    static String sen= "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.";
    public static void main(String[] args) {
       lowercase();
    }
    public static void lowercase(){
       String lower= sen.toLowerCase();
        System.out.println(lower);


    }
}
