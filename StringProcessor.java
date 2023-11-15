package org.example;
import java.util.regex.*;

public class StringProcessor {

    public boolean isStrongPassword(String password) {
        // Check for at least one uppercase letter, one lowercase letter, one digit, and one special symbol
        return password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!]).+$");
    }

    public int calculateDigits(String sentence) {
        // Count the number of digits using regular expression
        return sentence.replaceAll("[^0-9]", "").length();
    }

    public int calculateWords(String sentence) {
        // Split the sentence by spaces and count the number of resulting words
        String[] words = sentence.split("\\s+");
        return words.length;
    }

    public double calculateExpression(String expression) {
        // Evaluate the expression and return the result
        return evaluateExpression(expression);
    }

    private double evaluateExpression(String expression) {


        javax.script.ScriptEngineManager mgr = new javax.script.ScriptEngineManager();
        javax.script.ScriptEngine engine = mgr.getEngineByName("JavaScript");

        try {
            Object result = engine.eval(expression);
            if (result instanceof Number) {
                return ((Number) result).doubleValue();
            } else {
                throw new IllegalArgumentException("Invalid expression result");
            }
        } catch (javax.script.ScriptException e) {
            throw new IllegalArgumentException("Invalid expression syntax");
        }
    }
}

