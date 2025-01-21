import java.util.Scanner;

public class MaximumOfThreeNumber{
   int findMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
	void displayResult(int ans){
		System.out.println("The maximum among three is "+ans);
	}
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three integers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
		MaximumOfThreeNumber max= new MaximumOfThreeNumber();
		int ans=max.findMax(a, b, c);
        max.displayResult(ans);
    }

    
}
