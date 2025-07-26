package Assignment1;
import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char backToMenu;

        do {
            System.out.println("********** MENU **********");
            System.out.println("1. Print Table of a Number");
            System.out.println("2. Calculate Factorial");
            System.out.println("3. Check Prime Number");
            System.out.println("4. Print Fibonacci Series");
            System.out.println("5. Exit");
            System.out.println("**************************");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1: 
                    System.out.print("Enter the number: ");
                    int num = scanner.nextInt();
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(num + " x " + i + " = " + (num * i));
                    }
                    break;

                case 2:
                    System.out.print("Enter a number: ");
                    int factNum = scanner.nextInt();
                    long factorial = 1;
                    for (int i = 1; i <= factNum; i++) {
                        factorial *= i;
                    }
                    System.out.println("Factorial of " + factNum + " is " + factorial);
                    break;

                case 3: 
                    System.out.print("Enter a number: ");
                    int primeNum = scanner.nextInt();
                    boolean isPrime = true;
                    int i = 2;
                    if (primeNum <= 1) {
                        isPrime = false;
                    } else {
                        while (i <= Math.sqrt(primeNum)) {
                            if (primeNum % i == 0) {
                                isPrime = false;
                                break;
                            }
                            i++;
                        }
                    }
                    if (isPrime) {
                        System.out.println(primeNum + " is a Prime Number.");
                    } else {
                        System.out.println(primeNum + " is NOT a Prime Number.");
                    }
                    break;

                case 4: 
                    System.out.print("Enter number of terms: ");
                    int terms = scanner.nextInt();
                    int a = 0, b = 1, next;
                    System.out.print("Fibonacci Series: ");
                    for (int j = 1; j <= terms; j++) {
                        System.out.print(a + " ");
                        next = a + b;
                        a = b;
                        b = next;
                    }
                    System.out.println();
                    break;

                case 5: 
                    System.out.println("Exiting program. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

            System.out.print("Back to Menu? (Y/N): ");
            backToMenu = scanner.next().charAt(0);
        } while (backToMenu == 'Y' || backToMenu == 'y');
    }
}
