import java.util.Scanner;
public class CountDown{
  public static void main(String[] args){
   Scanner sc= new Scanner(System.in);
   //Taking inputs from users
    System.out.println("Enter a number ");
    int counter=sc.nextInt();
	
	
	//Counting down the number
    
	while(counter >=1){
		
        System.out.println(counter--);		
	}
}
}