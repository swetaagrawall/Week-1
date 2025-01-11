import java.util.Scanner;

public class AreaCalculation {
   public AreaCalculation() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("Enter base in cm ");
      int var2 = var1.nextInt();
      System.out.println("Enter height in cm ");
      int var3 = var1.nextInt();
      double var4 = 0.5 * (double)var2 * (double)var3;
      double var6 = var4 / 2.54;
      System.out.println("The area in centimeters is " + var4 + " and the area in inches is " + var6);
   }
}