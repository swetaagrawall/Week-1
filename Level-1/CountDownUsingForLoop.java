import java.util.Scanner;
public class CountDownUsingForLoop{
  public static void main(String[] args){
   Scanner sc= new Scanner(System.in);
   //Taking inputs from users
    System.out.println("Enter a number ");
    int counter=sc.nextInt();
	
	
	//Counting down the number using foor loop
    
	for(int i=counter ;i>=1 ;i--){
		
        System.out.println(i);		
	}
}
}