import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {
    @Test
    public void testIfWordIsAPalindrome(){
        Palindrome palindrome = new Palindrome();
        String word = "mum";
        boolean checkIfPalindrome = palindrome.checkPalindrome(word);
        assertTrue(checkIfPalindrome);
    }
}