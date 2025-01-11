public class UniversityDiscount{
    public static void main(String[] args){
      
       //creating a variable named fee
        int fee=125000;
       //Creating another variable discountPercent
        int discountPercent= 10;
       //Calculating discounted amount and discounted price
        int discountAmount=fee/discountPercent;
        int discountedFee= fee-discountAmount;
       //Printing output to terminal
        System.out.println("The discount amount is INR "+(discountAmount)+" and the final discounted fee is " + (discountedFee));
        
      
    }
 }