package Assignment2;

import java.util.Scanner;

class StringUtility {

    public int countVowels(String str) {
        int count = 0;
        for (char ch : str.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(ch) != -1) count++;
        }
        return count;
    }

    public int countConsonants(String str) {
        int count = 0;
        for (char ch : str.toLowerCase().toCharArray()) {
            if (Character.isLetter(ch) && "aeiou".indexOf(ch) == -1) count++;
        }
        return count;
    }

    public boolean isPalindrome(String str) {
        str = str.replaceAll("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    public String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public String toUpperCase(String str) {
        return str.toUpperCase();
    }

    public String toLowerCase(String str) {
        return str.toLowerCase();
    }

    public String replaceWord(String str, String oldWord, String newWord) {
        return str.replace(oldWord, newWord);
    }
}
