import java.util.Scanner;

public class NumberGuessingGame{
 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
        int lowerBound = 1, upperBound = 100;
        System.out.println("Think of a number between 1 and 100.");
        while (true) {
            int guess = generateGuess(lowerBound, upperBound);
            System.out.println("Is the number " + guess + "? (Enter: high, low, correct)");
            String feedback = sc.nextLine().toLowerCase();
            if (feedback.equals("correct")) {
                System.out.println("I guessed it!");
                break;
            } else if (feedback.equals("high")) {
                upperBound = guess - 1;
            } else if (feedback.equals("low")) {
                lowerBound = guess + 1;
            }
        }
    }

static int generateGuess(int lowerBound, int upperBound) {
        Random rand = new Random();
        return rand.nextInt(upperBound - lowerBound + 1) + lowerBound;
    }
}

