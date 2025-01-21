import java.util.Scanner;

public class FibonacciGenerator{
	
	public void generateFibonacci(int sequence) {
        int a = 0, b = 1;
        for (int i = 1; i <= sequence; i++) {
            System.out.print(a + " ");
            int nextElement = a + b;
            a = b;
            b = nextElement;
        }
    }
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of sequence");
        int sequence = sc.nextInt();
		FibonacciGenerator fg = new FibonacciGenerator();
        fg.generateFibonacci(sequence);
    }

    
}

