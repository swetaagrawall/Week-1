import java.util.Scanner;

public class StudentVoteChecker{
  public boolean canStudentVote(int age){
    if (age < 0) {
      return false;
    }
    return (age >= 18) ? true : false; // checking via ternary operator
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int arr[] = new int[10];
    System.out.print("Enter age of Students : ");
    for (int i = 0; i<10; i++) {
      arr[i] = sc.nextInt();
    }
	StudentVoteChecker svc = new StudentVoteChecker();
    for (int i = 0; i < arr.length; i++) {
      if (svc.canStudentVote(arr[i])) {
        System.out.println("Student " + (i+1) + " can vote ");
      }
      else {
        System.out.println("Student " + (i+1) + " can't vote");
      }
    }
  }
}
