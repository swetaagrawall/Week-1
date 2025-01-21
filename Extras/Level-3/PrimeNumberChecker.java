
import java.util.Scanner;

public class PrimeNumberChecker{
	public boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
	void displayResult(boolean ans, int num){
		if (ans) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
	}
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
		PrimeNumberChecker pc = new PrimeNumberChecker();
        boolean ans=pc.isPrime(num);
		pc.displayResult(ans , num);
    }

    
}