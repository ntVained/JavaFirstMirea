package ru.mirea.task14.opt7;

public class PasswordChecker {

    public static void main(String[] args) {
        String[] passwords = {
                "F032_Password",
                "TrySpy1",
                "smart_pass",
                "A007"
        };

        for (String password : passwords) {
            System.out.println("Пароль: " + password + " - Надежный: " + isPasswordStrong(password));
        }
    }

    public static boolean isPasswordStrong(String password) {
        if (password.length() < 8) {
            return false;
        }

        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(c)) {
                hasLowerCase = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            } else if (c != '_') {
                return false;
                }
        }
        return hasUpperCase && hasLowerCase && hasDigit;
    }
}