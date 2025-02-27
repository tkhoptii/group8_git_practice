package iliyana1309;

public class PasswordValidator {

    public static boolean isValidPassword(String password) {
        // Requirement 1: At least 6 characters and no spaces
        if (password.length() < 6 || password.contains(" ")) {
            return false;
        }

        // Requirement 2: At least one uppercase letter
        if (!password.matches(".*[A-Z].*")) {
            return false;
        }

        // Requirement 3: At least one lowercase letter
        if (!password.matches(".*[a-z].*")) {
            return false;
        }

        // Requirement 4: At least one special character
        if (!password.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?].*")) {
            return false;
        }

        // Requirement 5: At least one digit
        if (!password.matches(".*[0-9].*")) {
            return false;
        }

        // If all requirements are met, return true
        return true;
    }

    public static void main(String[] args) {
        String testPassword1 = "Strong@123"; // Valid
        String testPassword2 = "weakpass";   // Invalid
        String testPassword3 = "NoDigit!";   // Invalid
        String testPassword4 = "123456";     // Invalid

        System.out.println(isValidPassword(testPassword1)); // true
        System.out.println(isValidPassword(testPassword2)); // false
        System.out.println(isValidPassword(testPassword3)); // false
        System.out.println(isValidPassword(testPassword4)); // false
    }
}
