import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		//Taking inputs from users and printing result
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        boolean isPrime = true;
		//Logic of prime number
        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false; 
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println(number+" is a prime number.");
        } else {
            System.out.println(number+" is not a prime number.");
        }
    }
}