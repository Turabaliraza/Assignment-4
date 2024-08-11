import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        factorial(); // Call the factorial method
    }

    public static void factorial() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a number to find the factorial: ");
        int i = myObj.nextInt();

        long result = calculateFactorial(i);

        System.out.println("Factorial of " + i + " is: " + result);
    }

    public static long calculateFactorial(int n) {
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers");
        }
        if (n == 0) {
            return 1; // Base case: 0! = 1
        }
        return n * calculateFactorial(n - 1); // Recursive case
    }
}
