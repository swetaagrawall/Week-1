import java.util.Scanner;
public class LargestAmongThree{
  public static void main(String[] args){
   Scanner sc= new Scanner(System.in);
   //Taking inputs from users
    System.out.println("Enter a first number ");
    int number1=sc.nextInt();
	System.out.println("Enter a second number ");
    int number2=sc.nextInt();
	System.out.println("Enter a third number ");
    int number3=sc.nextInt();
	
	//Checking the largest among three of them and printing output 
	if(number1>number2 && number1>number3){
		System.out.println("Is the first number the largest? -- Yes" +'\n'+"Is the second number the largest? -- No" +'\n'+"Is the third number the largest? -- No");
	}else if(number2>number1 && number2>number3){
		System.out.println("Is the first number the largest? -- No" +'\n'+"Is the second number the largest? -- Yes" +'\n'+"Is the third number the largest? -- No");
	}
    else{
		System.out.println("Is the first number the largest? -- No" +'\n'+"Is the second number the largest? -- No" +'\n'+"Is the third number the largest? -- Yes");
	}		
	
}
}