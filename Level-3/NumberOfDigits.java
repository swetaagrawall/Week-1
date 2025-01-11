import java.util.Scanner;

public class NumberOfDigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
		// taking number input
        int number = sc.nextInt(); 
        int count = 0;
        
        while (number != 0) { 
          number /= 10; // removes last digit
          count++; // increament counter by 1
        }
        
        System.out.println("The number of digit is: " + count);
        sc.close();
    }
}