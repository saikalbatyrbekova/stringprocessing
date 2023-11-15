package org.example;

public class Main {
    public static void main(String[] args) {
        StringProcessor processor = new StringProcessor();

        // Test cases for isStrongPassword method
        System.out.println(processor.isStrongPassword("Abcd123!")); // true
        System.out.println(processor.isStrongPassword("WeakPassword")); // false
        System.out.println(processor.isStrongPassword("12345678")); // false
        System.out.println(processor.isStrongPassword("NoDigitOrSymbol")); // false
        System.out.println(processor.isStrongPassword("Very@Strong#Pwd1")); // true

        // Test cases for calculateDigits method
        System.out.println(processor.calculateDigits("Hello123")); // 3
        System.out.println(processor.calculateDigits("NoDigitsHere")); // 0
        System.out.println(processor.calculateDigits("1234567890")); // 10
        System.out.println(processor.calculateDigits("Special@Character#123")); // 3
        System.out.println(processor.calculateDigits("CountMeIn456")); // 3

        // Test cases for calculateWords method
        System.out.println(processor.calculateWords("This is a sentence.")); // 4
        System.out.println(processor.calculateWords("SingleWord")); // 1
        System.out.println(processor.calculateWords("  LeadingSpacesTrimmed  ")); // 2
        System.out.println(processor.calculateWords("Multiple     Spaces     Between     Words")); // 7
        System.out.println(processor.calculateWords("NoSpacesHere")); // 1

        // Test cases for calculateExpression method
        System.out.println(processor.calculateExpression("2 * (3 + 4)")); // 14.0
        System.out.println(processor.calculateExpression("(5 + 3) / 2")); // 4.0
        System.out.println(processor.calculateExpression("10 / 0")); // Infinity (not recommended in real scenarios)
        System.out.println(processor.calculateExpression("sqrt(16)")); // 4.0
        System.out.println(processor.calculateExpression("3.5 * 2.0")); // 7.0
    }

}