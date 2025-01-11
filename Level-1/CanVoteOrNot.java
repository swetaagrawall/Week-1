import java.util.Scanner;

public class CanVoteOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		//creating an array
		int arr[]= new int[10];
        //Taking inputs from user
		System.out.println("Enter the age of 10 students");
		for(int i=0 ;i<10;i++){
			arr[i]=sc.nextInt();
			
		}
		//Implementing Logic
		for(int i=0 ;i<10;i++){
			if(arr[i]>=18){
				System.out.println("The student with the age"+arr[i]+" can vote");
			}
			else if(arr[i]<18 && arr[i]>=0){
				System.out.println("The student with the age"+arr[i]+" cannot vote");
			}
			else{
				System.out.println("Invalid age");
			}
			
		}
		
		sc.close();
    }
}
}