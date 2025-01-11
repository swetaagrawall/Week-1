import java.util.Scanner;
public class TemperatureConversion2{
  public static void main(String[] args){
   Scanner sc= new Scanner(System.in);
    System.out.println("Enter temperature in fahrenheit");
    double fahrenheit=sc.nextDouble();
	//calculating temperature in fahrenheit
	double celsiusResult  = (double)(fahrenheit-32) * (double)(5/9) ;
     System.out.println("The "+(fahrenheit)+" fahrenheit is "+ (celsiusResult) + " celsius.");
}
}