public class ProfitLoss{
    public static void main(String[] args){
        //Taking selling price and cost price
        int sP= 191 , cP=129;
       //calculating profit  and profitPercentage
        int profit=sP-cP;
        double profitPercentage=((double)profit/cP*100);
       //Printing output to terminal
        System.out.println("The cost price is INR : " + (cP) + " and selling price is INR : " + (sP));
        System.out.println("The Profit is INR : " + (profit) + " and profitPercentage is : " + (profitPercentage));
    }
 }