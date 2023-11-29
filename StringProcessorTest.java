package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringProcessorTest {

    @Test
    public void testIsStrongPassword() {
        StringProcessor sp = new StringProcessor();

        assertTrue(sp.isStrongPassword("StrongP@ssword1")); // True
        assertFalse(sp.isStrongPassword("weakpassword")); // False
        assertFalse(sp.isStrongPassword("NoSpecialCharacter1")); // False
        assertFalse(sp.isStrongPassword("NoDigitOrSymbol")); // False
        assertFalse(sp.isStrongPassword("AllLowerCaseWith1symbol@")); // False
    }

    @Test
    public void testCalculateDigits() {
        StringProcessor sp = new StringProcessor();

        assertEquals(3, sp.calculateDigits("123abc456")); // True
        assertEquals(0, sp.calculateDigits("NoDigitsHere")); // True
        assertEquals(5, sp.calculateDigits("Testing12345")); // True
        assertEquals(1, sp.calculateDigits("Only1Digit")); // True
        assertEquals(0, sp.calculateDigits("")); // True
    }

    @Test
    public void testCalculateWords() {
        StringProcessor sp = new StringProcessor();

        assertEquals(3, sp.calculateWords("This is a test")); // True
        assertEquals(0, sp.calculateWords("")); // True
        assertEquals(1, sp.calculateWords("SingleWord")); // True
        assertEquals(5, sp.calculateWords("Words separated by spaces")); // True
        assertEquals(2, sp.calculateWords("  Leading and trailing spaces  ")); // True
    }

    @Test
    public void testCalculateExpression() {
        StringProcessor sp = new StringProcessor();

        assertEquals(10.0, sp.calculateExpression("5+5")); // True
        assertEquals(15.0, sp.calculateExpression("10+5")); // True
        assertEquals(-5.0, sp.calculateExpression("0-5")); // True
        assertEquals(25.0, sp.calculateExpression("5*5")); // True
        assertEquals(2.0, sp.calculateExpression("10/5")); // True
    }
}
