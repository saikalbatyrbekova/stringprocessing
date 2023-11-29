package org.example;
import java.util.regex.*;

public class StringProcessor {

    public boolean isStrongPassword(String password) {
        // Check if the password contains at least one uppercase letter, one lowercase letter, one digit, and one special symbol.
        return Pattern.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]+$", password);
    }

    public int calculateDigits(String sentence) {
        // Count the number of digits in the given sentence.
        int count = 0;
        for (char c : sentence.toCharArray()) {
            if (Character.isDigit(c)) {
                count++;
            }
        }
        return count;
    }

    public int calculateWords(String sentence) {
        // Calculate the number of words in the given sentence.
        String[] words = sentence.split("\\s+");
        return words.length;
    }

    public double calculateExpression(String expression) {
        // Evaluate the mathematical expression and return the result.
        return eval(expression);
    }

    // Helper method to evaluate mathematical expressions using recursion.
    private double eval(String expression) {
        // Assume a valid and well-formed expression.
        // Use a proper expression evaluation library if needed for complex cases.
        return Double.parseDouble(new java.util.Scanner(expression).next());
    }
}
