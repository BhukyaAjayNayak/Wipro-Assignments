package Assignment3;

import java.util.Scanner;

public class MenuApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MathOperations math = new MathOperations();

        int choice;

        do {
            System.out.println("\n********** MENU **********");
            System.out.println("1. Print Table of a Number");
            System.out.println("2. Calculate Factorial");
            System.out.println("3. Check Prime Number");
            System.out.println("4. Print Fibonacci Series");
            System.out.println("5. Exit");
            System.out.println("**************************");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a number: ");
                    int tableNum = sc.nextInt();
                    math.printTable(tableNum);
                    break;

                case 2:
                    System.out.print("Enter a number: ");
                    int factNum = sc.nextInt();
                    math.calculateFactorial(factNum);
                    break;

                case 3:
                    System.out.print("Enter a number: ");
                    int primeNum = sc.nextInt();
                    math.checkPrime(primeNum);
                    break;

                case 4:
                    System.out.print("Enter number of terms: ");
                    int terms = sc.nextInt();
                    math.printFibonacci(terms);
                    break;

                case 5:
                    System.out.println("Exiting Program. Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 5);

        sc.close();
    }
}
