import java.util.Scanner;

public class SmallestAndLargestNumber {
	
	//method for calculating sum of n natural numbers
   public static int[] findSmallestAndLargest(int number1, int number2, int number3){
			
			int answer[] = new int[2];
			int smallest = Math.min(number1 ,Math.min(number2,number3));
			answer[0]=smallest;
			int largest = Math.max(number1,Math.max(number2 ,number3));
			answer[1]=largest;
			return answer;
	}
	
	//main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Taking input from user
        System.out.print("Enter first number: ");
        int number1 = input.nextInt();
		System.out.print("Enter second number: ");
        int number2 = input.nextInt();	
		System.out.print("Enter third number: ");
        int number3 = input.nextInt();	
		int answer [] =findSmallestAndLargest(number1, number2, number3);
		//Printing the output
        System.out.println("The Smallest Number is "+answer[0]+" and the Largest number is "+answer[1]+ " among 3 numbers" );
        
    }
}
