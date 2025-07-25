package Assignment3;



public class MathOperations {

    public void printTable(int number) {
        System.out.println("Multiplication Table for " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }

    public void calculateFactorial(int number) {
        long fact = 1;
        for (int i = 1; i <= number; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + number + " is: " + fact);
    }

    public void checkPrime(int number) {
        if (number <= 1) {
            System.out.println(number + " is NOT a prime number.");
            return;
        }

        boolean isPrime = true;
        int i = 2;
        while (i <= Math.sqrt(number)) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
            i++;
        }

        if (isPrime)
            System.out.println(number + " is a Prime number.");
        else
            System.out.println(number + " is NOT a Prime number.");
    }

    public void printFibonacci(int terms) {
        int a = 0, b = 1, next;
        System.out.print("Fibonacci Series (" + terms + " terms): ");
        for (int i = 1; i <= terms; i++) {
            System.out.print(a + " ");
            next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }
}

