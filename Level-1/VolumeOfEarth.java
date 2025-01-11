public class VolumeOfEarth{
    public static void main(String[] args){
       //creating a variable name radius
        int radius=6378;
       //Calculating volume of earth in cubic kilometers and in miles
        double volumeInKm=(4/3)*Math.PI*(radius*radius*radius);
        double volumeInMiles= volumeInKm*1.6;
       //Printing output to terminal
        System.out.println("The volume of earth in cubic kilometers is : "+(volumeInKm)+" and in cubic meters is : " + (volumeInMiles));
        
      
    }
 }
 
 