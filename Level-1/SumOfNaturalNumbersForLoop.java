import java.util.Scanner;

public class SumOfNaturalNumbersForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Getting Input from user
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();
        // Check if the number is natural
        if (n < 0) {
            System.out.println("The number " + n + " is not a natural number.");
            return;
        }
        //calculating result
        int formulaSum = n * (n + 1) / 2;
        int loopSum = 0;
        for (int i = 1; i <= n; i++) {
            loopSum += i;
        }
        // Print results
        System.out.println("Sum using formula: " + formulaSum);
        System.out.println("Sum using for loop: " + loopSum);
        if (formulaSum == loopSum) {
            System.out.println("Both computations match and are correct!");
        } else {
            System.out.println("The computations do not match, check for errors.");
        }
		sc.close();
    }
}