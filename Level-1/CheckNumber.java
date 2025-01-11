import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		//creating an array
		int arr[]= new int[5];
        //Taking inputs from user
		System.out.println("Enter the 5 numbers");
		for(int i=0 ;i<5;i++){
			arr[i]=sc.nextInt();
			
		}
		//Implementing Logic
		for(int i=0 ;i<5;i++){
			if(arr[i]<0){
				System.out.println("The number "+arr[i]+" is a negative number.");
			}
			else if(arr[i]==0){
				System.out.println("The number "+arr[i]+" is zero");
			}
			else{
				if(arr[i]%2==0){
				   System.out.println("The number "+arr[i]+" is an even number.");
			   }
			   else if(arr[i]==0){
				System.out.println("The number "+arr[i]+" is an odd number");
			}
			}
			
		}
		//Finally checking the fisrt and last number
		if(arr[0]==arr[arr.length-1]){
			System.out.println("The First and last number are equal");
			   }
			   else {
				System.out.println("The First and last number are not equal");
			}
		
	
    }
}
