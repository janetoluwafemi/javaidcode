public class Palindrome {
    public boolean checkPalindrome(String word) {
        char result = '\u0000';
        String comparing = "";
        for(int count = word.length()-1; count >= 0; count--) {
            result = word.charAt(count);
            comparing = comparing + result;
            if(comparing.equals(word)) {
                return true;
            }
        }
        return false;
    }
}
