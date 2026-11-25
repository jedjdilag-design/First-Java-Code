import java.util.*;

public class Midterm_Activity1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        login(sc);
    }

    static final String CORRECT_NAME = "Jediah Jireh";
    static final String CORRECT_ID = "3707";

    static void login(Scanner sc) {
        System.out.print("Enter employee name: ");
        String name = sc.nextLine().trim();
        System.out.print("Enter employee id: ");
        String id = sc.nextLine().trim();

        if (name.isEmpty()) {
            System.out.println("employee name should not be empty. Please try again.");
            login(sc);
        } else if (id.isEmpty()) {
            System.out.println("employee id should not be empty. Please try again.");
            login(sc);
        } else if (name.equals(CORRECT_NAME) && id.equals(CORRECT_ID)) {
            System.out.println("System is ready to use");
        } else if (name.equals(CORRECT_NAME)) {
            System.out.println("invalid id");
            login(sc);
        } else if (id.equals(CORRECT_ID)) {
            System.out.println("invalid name");
            login(sc);
        } else {
            System.out.println("invalid credentials");
            login(sc);
        }
    }

}