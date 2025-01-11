import java.util.Scanner;
public class DivisibleBy5{
  public static void main(String[] args){
   Scanner sc= new Scanner(System.in);
   //Taking inputs from users
    System.out.println("Enter a number ");
    int number=sc.nextInt();
	
	//Checking whether it is divisible by 5 or not and printing output 
	if(number % 5 ==0){
		System.out.println("Is the number "+number+" divisible by 5? -- Yes");
	}else{
		System.out.println("Is the number "+number+" divisible by 5? -- No");
	}		
	
}
}