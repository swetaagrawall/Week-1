import java.util.*;


public class TravelComputation{

    	public static void main(String[]args){
	
	  		Scanner sc = new Scanner(System.in);
		
		//Create a variable name and take input from user to indicate the person travelling
		System.out.println("Enter the name of the person :");
		String name = sc.nextLine();
		
				System.out.println("Enter from City: ");
		String fromCity =sc.nextLine();
		
		System.out.println("Enter viaCity: ");
		String viaCity =sc.nextLine();
		
		System.out.println("Enter toCity: ");
		String toCity =sc.nextLine();
				System.out.println("Enter Distance from to via: ");
		double distanceFromToVia =sc.nextDouble();
		
				int timeFromToVia = 4*60+4;
				System.out.println("Enter Distance Via to Final city: ");
		double distanceViaToFinalCity = sc.nextDouble();
		
				int timeViaToFinalCity = 4*60+25;
				double totalDistance = distanceFromToVia + distanceViaToFinalCity;
		
				int totalTime = timeFromToVia+timeViaToFinalCity;
		
		//Print the travel Details
		System.out.println("The Total Distance travelled by "+ name + " from "+
		                    fromCity +" to "+ toCity+" via "+ viaCity +" is "
							 + totalDistance + " km and "+ "the Total Time taken is " +totalTime+" minutes");
	}
}