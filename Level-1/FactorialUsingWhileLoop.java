import java.util.Scanner;

public class FactorialUsingWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Getting Input from user
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();
        // Check if the number is positive
        if (number < 0) {
            System.out.println("The number " + number + " is not a positive integer.");
            return;
        }
        // Compute factorial result and logic
        long factorial = 1;
        int i = 1;
        while (i <= number) {
            factorial *= i;
            i++;
        }
    // Print the result
        System.out.println("The factorial of " + number + " is: " + factorial);
		sc.close();
    }
}