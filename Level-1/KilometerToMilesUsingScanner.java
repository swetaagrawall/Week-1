public class KilometerToMilesUsingScanner{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
       //Taking input from user
        System.out.println("Enter distance in km");
        double km=sc.nextInt();
       //Converting it into miles
        double distanceInMiles=km*1.6;
       //Printing output to terminal
        System.out.println("The total miles is "+(distanceInMiles)+" mile for the given " + (km) + " km");
        
      
    }
 }