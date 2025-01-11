import java.util.Scanner;

public class FactorialUsingForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Getting Input from user
        System.out.print("Enter a integer: ");
        int number = sc.nextInt();
      // Check if the number is positive
        if (number < 0) {
            System.out.println("The number " +number+ " is not a positive integer.");
            return;
        }
        // Calculating factorial
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        // Print the result
        System.out.println("The factorial of " + number + " is: " + factorial);
    }
}