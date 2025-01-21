import java.util.Scanner;

public class FactorialUsingRecursion{
	public int factorial(int num) {
        if (num == 0) return 1;
        return num * factorial(num - 1);
    }
 public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt(); 
		FactorialUsingRecursion fr = new FactorialUsingRecursion();
        System.out.println("Factorial of the "+ num + " is "+fr.factorial(num));
    }

    
}
