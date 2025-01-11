import java.util.Scanner;

public class BmiCalculationIn2DArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of persons: ");
        int number = scanner.nextInt();
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];
        for (int i = 0; i < number; i++) {
            double height, weight;
            do {
				System.out.println("Enter height of person " + (i + 1));
                height = scanner.nextDouble();
                if (height <= 0) {
                    System.out.println("please enter a height in positive integer");
                }
            } while (height <= 0);
			do {
                System.out.println("Enter weight of person " +(i + 1));
                weight = scanner.nextDouble();
                if (weight <= 0) {
                    System.out.println("please enter a weight in positive integer");
            } }while (weight <= 0);
            personData[i][0] = weight;
            personData[i][1] = height;
            double bmi = weight/(height*height);
            personData[i][2] = bmi;
            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (bmi >= 25 && bmi < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }
        for(int i=0 ;i<number ;i++){
			System.out.println("The  height, weight, BMI, and weight status of person "+(i+1)+" is "+personData[i][0]+" , "+personData[i][1]+" , "+personData[i][2]+" and "+weightStatus[i]);	
			
		}		
        scanner.close();
    }
}
