import java.util.Scanner;


public class FrequencyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		//taking input from user
        System.out.print("Enter a number ");
        int number  = sc.nextInt();
		int temp1=number;
		int temp2=number;
		int countDigits=0;
		while(temp1!=0){
				countDigits++;
			    temp1/=10;
		}
		
		int digits[]=new int[countDigits];
		int index=countDigits-1;
		while(temp2!=0){
				digits[index--]=temp2%10;
			    temp2/=10;
				
			}
			
		int[] frequency = new int[10];
		while (number != 0) {
            int digit = number % 10;
            frequency[digit]++;
            number /= 10;
        }
		System.out.println("Digit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Frequency of digit " + i + " is " + frequency[i]);
            }
        }

		sc.close();
    }
}
