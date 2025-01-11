import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		//getting input from users
        System.out.print("Enter your weight in kg: ");
        double weight = sc.nextDouble();
        System.out.print("Enter height in cm: ");
        double height = sc.nextDouble();
        // Convert height from cm to m
        double heightInMeters = height / 100;
        double bmi = weight / (heightInMeters * heightInMeters);
        String weightStatus;
        if (bmi <= 18.4) {
            weightStatus = "Underweight";
        } else if (bmi >= 40.0) {
            weightStatus = "Obese";
        } else if (bmi >= 25.0 && bmi <= 39.9) {
            weightStatus = "Overweight";
        } else {
            weightStatus = "Normal";
        }

        // Printing results
        System.out.printf("%.2f%n", bmi);
        System.out.println("Weight Status: " + weightStatus);

        sc.close();
    }
}