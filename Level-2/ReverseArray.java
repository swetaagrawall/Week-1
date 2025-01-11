import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int number=sc.nextInt();
		int temp1=number;
		int temp2=number;
		int countDigits=0;
		while(temp1!=0){
				countDigits++;
			    temp1/=10;
		}
		
		int reverseDigitArray[]=new int[countDigits];
		int index=0;
		while(temp2!=0){
				reverseDigitArray[index++]=temp2%10;
			    temp2/=10;
		}
		 System.out.println("Reversed Digit is : ");
        for(int i=0;i<countDigits;i++){
			 System.out.print(reverseDigitArray[i]);
		}			
       sc.close();
    }
}   