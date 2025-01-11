import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		//Taking inputs from user
		System.out.println("Enter a number");
		int number=sc.nextInt();
		
		//creating an array
		int arr[]= new int[10];
        
		
		//Implementing Multiplication Logic
		int j=0;
		for(int i=1 ;i<=10;i++){
			arr[j++]=number*i;
			
		}
		for(int i=0 ;i<10;i++){
         System.out.println(number+" * " +(i+1)+" = "+arr[i]);			
		}
		sc.close();
    
}
}