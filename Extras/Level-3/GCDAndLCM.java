import java.util.Scanner;

public class GCDAndLCM{
	static int gcd(int a, int b) {
        int i;
        if (a<b) i=a;
        else i= b;
        for (int j=i;j >1;j--) {
          if (a%j==0 && b%j== 0)
                return j;
        }
         return 1;
    }

    static int lcm(int a, int b) {
        return Math.abs(a * b) / gcd(a, b);
    }
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
		int b = sc.nextInt();
        System.out.println("GCD: " + gcd(a, b));
        System.out.println("LCM: " + lcm(a, b));
    }

    
}