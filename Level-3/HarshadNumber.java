import java.util.Scanner;

public class HarshadNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
		// taking  input vfrom user
        int number = sc.nextInt(); 
        int sum = 0, originalNumber = number; 
		
    //Implementing logics    
        while (originalNumber != 0) { 
          sum += originalNumber % 10; // adds all the digit in sum
          originalNumber /= 10; // removes last digit
        }
        if (number % sum == 0) { // checking if number is fully divisible
          System.out.println(number+" is Harshad Number.");
        }
        else {
          System.out.println(+number+ " is Not a harshad number.");
        }
        sc.close();
    }
}