import java.util.Scanner;

public class BasicCalculator{
	    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) return Double.NaN;
        return a / b;
    }
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        System.out.println("Enter operation ");
        char op = sc.next().charAt(0);
		
		BasicCalculator bc= new BasicCalculator();
        switch (op) {
            case '+':
                System.out.println("Result after adding two numbers " + bc.add(num1, num2));
                break;
            case '-':
                System.out.println("Result after substracting two numbers " + bc.subtract(num1, num2));
                break;
            case '*':
                System.out.println("Result after multiplying two numbers " + bc.multiply(num1, num2));
                break;
            case '/':
                System.out.println("Result after dividing two numbers " + bc.divide(num1, num2));
                break;
            default:
                System.out.println("Invalid operation");
        }
    }


}







