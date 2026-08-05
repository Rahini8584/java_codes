import java.util.Scanner;

public class LoginDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String correctUsername = "rahini";

        System.out.print("Enter username: ");
        String username = sc.nextLine();

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        if (username.equals(correctUsername) && isValidPassword(password)) {
            System.out.println("Login successful");
        } else {
            System.out.println("Invalid username or password");
        }

        sc.close();
    }

    public static boolean isValidPassword(String password) {
        if (password.length() != 8) {
            return false;
        }

        int digitCount = 0;
        int upperCount = 0;
        int lowerCount = 0;
        int specialCount = 0;

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isDigit(ch)) {
                digitCount++;
            } else if (Character.isUpperCase(ch)) {
                upperCount++;
            } else if (Character.isLowerCase(ch)) {
                lowerCount++;
            } else {
                specialCount++;
            }
        }

        return digitCount >= 3 &&
               upperCount >= 1 &&
               lowerCount >= 3 &&
               specialCount >= 1;
    }
}