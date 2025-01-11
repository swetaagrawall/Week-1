import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int number = sc.nextInt();
        
         //having copy of origial num 
		 int temp=number;
		 int sumOfCubes=0;
		 while(number!=0){
			 int a=number%10;
			 sumOfCubes=sumOfCubes+(int)(Math.pow(a,3));
			 number/=10;
		 }
		//chceking whether its Armstrong Number or not
		if(temp==sumOfCubes){
          System.out.println(number + " is an Armstrong number.");
        }
        else {
          System.out.println(number + " is not an Armstrong number.");
        }
        sc.close();
		}
    }
