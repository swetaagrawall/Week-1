import java.util.Scanner;

public class PercentageCalculationUsing2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int number = sc.nextInt();
        int[][] marks = new int[number][3];
        double[] percentageArray = new double[number];
        String[] gradesArray = new String[number];
		double averageMark=0.0d ;
		String gradeAndRemarks = "";
        for (int i = 0; i < number; i++) {
            System.out.println("Enter marks for student " +(i + 1));
            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                do {
                    System.out.print("Enter " + subject + " marks: ");
                    marks[i][j] = sc.nextInt();
                    if (marks[i][j] < 0 || marks[i][j] > 100) {
                        System.out.println("Marks must be between 0 and 100. Please enter again.");
                    }
                } while (marks[i][j] < 0 || marks[i][j] > 100);
            }
		
           averageMark=((marks[i][0] + marks[i][1] + marks[i][2])*100)/300;
		   percentageArray[i]=averageMark;
        if (averageMark >= 80) {
            gradeAndRemarks = "Level 4";
			gradesArray[i]=gradeAndRemarks;
        } else if (averageMark >= 70 && averageMark < 80) {
            gradeAndRemarks = "Level 3";
			gradesArray[i]=gradeAndRemarks;
        } else if (averageMark >= 60 && averageMark < 70) {
            gradeAndRemarks = "Level 2";
			gradesArray[i]=gradeAndRemarks;
        } else if (averageMark >= 50 && averageMark < 60) {
            gradeAndRemarks = "Level 1";
			gradesArray[i]=gradeAndRemarks;
        } else if (averageMark >= 40 && averageMark < 50) {
            gradeAndRemarks = "Level 1-";
			gradesArray[i]=gradeAndRemarks;
        } else {
            gradeAndRemarks = "Remedial standards";
			gradesArray[i]=gradeAndRemarks;
        }
		}
        for (int i = 0; i < number; i++) {
            System.out.println("Marks , percentages and grades of student"+(i + 1)+" , "+ marks[i][0]+" , " + marks[i][1]+" , "+marks[i][2]+" , " +percentageArray[i]+" , " + gradesArray[i]);
        }

        sc.close();
    }
}
