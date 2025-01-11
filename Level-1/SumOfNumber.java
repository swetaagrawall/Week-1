import java.util.Scanner;

public class SumOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		//creating an array and variable
		double arr[]= new double[10];
		 //Taking inputs from user
		double total=0.0;
		//Implementing Logic
		int index=0;
		while(true){
			System.out.println("Enter the number");
			int num=sc.nextInt();
			if(num<=0 || index==10){
			 break;
			}else{
				arr[index]=num;
			}
		 index++;	
		}
	
		int sum=0;
		for(int i=0 ;i<arr.length;i++){
			sum+=arr[i];
			
		}
     System.out.println("The total of all the element of an array is "+sum);
		
		sc.close();
    
}
}