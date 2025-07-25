package Assignment2;

 import java.util.Scanner;
import java.util.Scanner;

public class StringAssignmentApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringUtility util = new StringUtility();

        System.out.print("Enter a string: ");
        String inputStr = sc.nextLine();

        int choice;
        do {
            System.out.println("\n********** MENU **********");
            System.out.println("1. Count Vowels");
            System.out.println("2. Count Consonants");
            System.out.println("3. Check Palindrome");
            System.out.println("4. Reverse String");
            System.out.println("5. Convert to UPPERCASE");
            System.out.println("6. Convert to lowercase");
            System.out.println("7. Replace a word");
            System.out.println("8. Exit");
            System.out.println("**************************");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume leftover newline

            switch (choice) {
                case 1:
                    System.out.println("Vowel Count: " + util.countVowels(inputStr));
                    break;
                case 2:
                    System.out.println("Consonant Count: " + util.countConsonants(inputStr));
                    break;
                case 3:
                    if (util.isPalindrome(inputStr))
                        System.out.println("It is a Palindrome.");
                    else
                        System.out.println("Not a Palindrome.");
                    break;
                case 4:
                    System.out.println("Reversed String: " + util.reverseString(inputStr));
                    break;
                case 5:
                    System.out.println("Uppercase: " + util.toUpperCase(inputStr));
                    break;
                case 6:
                    System.out.println("Lowercase: " + util.toLowerCase(inputStr));
                    break;
                case 7:
                    System.out.print("Enter word to replace: ");
                    String oldWord = sc.nextLine();
                    System.out.print("Enter new word: ");
                    String newWord = sc.nextLine();
                    inputStr = util.replaceWord(inputStr, oldWord, newWord);
                    System.out.println("Updated String: " + inputStr);
                    break;
                case 8:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 8);

        sc.close();
    }
}

