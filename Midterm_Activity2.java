import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Midterm_Activity2 {
     
    static final String MATCHER_TEXT = "I'm taking BSIT-MWA and it is easy";

    static void askCourse(Scanner input) {
      System.out.print("Enter your course: ");
      String course = input.nextLine().trim();


      Pattern pattern = Pattern.compile("(?<![\\w-])" + Pattern.quote(course) + "(?![\\w-])");
      Matcher matcher = pattern.matcher(MATCHER_TEXT);

      if (!course.isEmpty() && matcher.find()) {
        System.out.println(MATCHER_TEXT);
      } else {
        System.out.println("You are not from the school of Information Technology. Try again!\n");
        askCourse(input);
      }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        askCourse(input);
        input.close();
    }
}