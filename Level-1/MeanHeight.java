import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		//creating an array
		double height[]= new double[11];
         
		 //Taking inputs from user
		System.out.println("Enter 11 height of players present in a football team. ");
		for(int i=0 ;i<11;i++){
			height[i]=sc.nextDouble();
			
		}
		
		//Implementing Mean Logic
		double sum=0;
		for(int i=0 ;i<11;i++){
			sum+=height[i];
		}
		double average=(double)sum/11;
         System.out.println("The averge height of players present in a football team is " +average);			
		
		sc.close();
    
}
}