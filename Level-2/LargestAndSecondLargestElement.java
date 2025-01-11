import java.util.Scanner;

public class LargestAndSecondLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int number=sc.nextInt();
        int maxDigit =10;
        int index=0;		
		int digits[]=new int[maxDigit];
		int temp=number;
		while(number!=0){
			if(index <maxDigit){
				digits[index]=number%10;
			    number/=10;
				index++;
			}else{
				break;
			}
		}
		int largest=0 , secondLargest=0;
		for(int i=0 ;i<digits.length;i++){
			if(digits[i]>largest){
				largest=digits[i];
			}
		}
		 for (int i = 0; i <digits.length; i++) {
            if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }
    
        System.out.println("The Largest number is " + largest);
        System.out.println("The second Largest number is " + secondLargest);
    }
}   