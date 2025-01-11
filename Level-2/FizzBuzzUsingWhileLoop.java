import java.util.Scanner;


import java.util.Scanner;
public class FizzBuzzUsingWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		//Getting input from users
        System.out.print("Enter a number");
        int number = sc.nextInt();
		//Implementing the logic
        if (number > 0) {
            int i = 1;
            while (i <= number) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
                i++; 
            }
        } else {
            System.out.println("Is not a positive integer.");
        }
    }
}