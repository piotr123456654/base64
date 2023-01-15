import java.util.Random;

public class PasswordGenerator {
    public static void main(String[] args) {
        System.out.println(generatePassword());
    }

    public static String generatePassword() {
        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String specialChars = "!@#$%^&*_=+-";

        String allChars = upperCase + lowerCase + digits + specialChars;
        Random random = new Random();

        StringBuilder password = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            password.append(allChars.charAt(random.nextInt(allChars.length())));
        }
        return password.toString();
    }
}
