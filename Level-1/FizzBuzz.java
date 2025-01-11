import java.util.Scanner;


public class FizzBuzz{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		//Taking inputs from user
		System.out.println("Enter a number ");
		int number=sc.nextInt();
		//creating an array 
		String fizzBuzzArray[]= new String[number+1];
		 if (number > 0) {
		for(int i=0 ;i<=number;i++){
                if (i % 3 == 0 && i % 5 == 0) {
                    fizzBuzzArray[i]="FizzBuzz";
                } else if (i % 3 == 0) {
                   fizzBuzzArray[i]="Fizz";
                } else if (i % 5 == 0) {
                    fizzBuzzArray[i]="Buzz";
                } else {
                   fizzBuzzArray[i]=String.valueOf(i);
                }
      
		}
		System.out.println("Printing Results ");
		for(int j=1 ;j<=number;j++){
           System.out.println("Position "+i+" = " +fizzBuzzArray[j]);
		   }
		 }
		 else{
			 System.out.println(number+" is not a positive integer.");
		 }
	
		
		
		sc.close();
    
}
}