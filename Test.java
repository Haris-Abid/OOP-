import java.util.Scanner;

public class Test {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter username: ");
        String userName = input.nextLine();
        
        System.out.print("Enter password: ");
        String password = input.nextLine();

        // Compare using .equals for string comparison
        if (userName.equals(User.userName) && password.equals(User.password)) {
            System.out.println("Access Granted");
        } else {
            System.out.println("Access Not Granted");
        }

    }
}