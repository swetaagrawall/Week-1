import java.util.Scanner;

public class MultiplicationTableFrom6To9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		//Taking inputs from user
		System.out.println("Enter a number");
		int number=sc.nextInt();
		
		//creating an array
		int multiplicationResult[]= new int[4];
        
		
		//Implementing Multiplication Logic
		int j=0;
		for(int i=6 ;i<=9;i++){
			multiplicationResult[j++]=number*i;
			
		}
		for(int i=0 ;i<4;i++){
         System.out.println(number+" * " +(i+6)+" = "+multiplicationResult[i]);			
		}
		sc.close();
    
}
}