import java.util.Scanner;
public class ConvertWeight{
  public static void main(String[] args){
   Scanner sc= new Scanner(System.in);
   //Taking inputs from users
    System.out.println("Enter weight in pound ");
    int pound=sc.nextInt();
	//Converting into kilograms
	double weightInKgs=pound*2.2;
	//Printing results
  System.out.println(" The weight of the person in pound is "+pound+" and in kg is "+ weightInKgs);
}
}

