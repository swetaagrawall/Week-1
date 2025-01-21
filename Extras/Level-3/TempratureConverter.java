import java.util.Scanner;

public class TempratureConverter{
	public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
	public void display(double fahrenheitCelcius, double celsiusFahrenheit ){
		System.out.println("Fahrenheit to Celsius: " + fahrenheitCelcius );
		System.out.println("Celsius to Fahrenheit: " + celsiusFahrenheit);
	}
 public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenheit");
        double fahrenheit = sc.nextDouble();
        System.out.println("Enter temperature in Celsius");
        double celsius = sc.nextDouble();
		TempratureConverter tc = new TempratureConverter();
		double fahrenheitCelcius=tc.fahrenheitToCelsius(fahrenheit);
		double celsiusFahrenheit=tc.celsiusToFahrenheit(celsius);
		tc.display(fahrenheitCelcius , celsiusFahrenheit);
		
		}

    
}

