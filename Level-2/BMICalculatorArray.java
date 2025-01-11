import java.util.Scanner;

public class BMICalculatorArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		//getting input from users
        System.out.print("Enter number of person ");
        int number  = sc.nextInt();
		int weight[]=new int[number];
		int height[]=new int[number];
		int bmi[]=new int[number];
		String weightStatus[]=new String[number];
		for(int i=0 ;i<number ;i++){
			System.out.print("Enter weight of person "+(i+1)+" : ");	
			weight[i]=sc.nextInt();
		}
        for(int i=0 ;i<number ;i++){
			System.out.print("Enter height of person "+(i+1)+" : ");	
			height[i]=sc.nextInt();
		}

         for(int i=0 ;i<number ;i++){
			int calBmi=weight[i]/(height[i]*height[i]);
			bmi[i]=(calBmi);
             if (calBmi <= 18.4) {
			weightStatus[i]="Underweight";
			
        } else if (calBmi >= 40.0) {
			weightStatus[i]="Obese";
        } else if (calBmi >= 25.0 && calBmi <= 39.9) {
			 weightStatus[i]="Overweight";
        } else {
			weightStatus[i]="Normal";
        }				
		}

        for(int i=0 ;i<number ;i++){
			System.out.println("The  height, weight, BMI, and weight status of person "+(i+1)+" is "+height[i]+" , "+weight[i]+" , "+bmi[i]+" and "+weightStatus[i]);	
			
		}		
        
    

        sc.close();
    }
}