import java.util.Scanner;


public class PercentageCalculationArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		//taking input from user
        System.out.print("Enter number of person ");
        int number  = sc.nextInt();
		
		int marksArray[]=new int[3];
		double percentagesArray[]=new double[3];
		String gradesArray[]=new String[3];
		double averageMark=0.0d ;
		String gradeAndRemarks = "";
		
		for(int i=0;i<number;i++){
		System.out.println("Enter thr marks of physics,chemistry and maths of Student "+(i+1));
        int physics = sc.nextInt();
        int chemistry = sc.nextInt();
        int maths = sc.nextInt();
		if(physics<0 || maths<0 || chemistry<0){
			System.out.println("Please enter a marks in positive integers");
			i=i-1;
		}else{
			marksArray[0]=physics;
			marksArray[1]=chemistry;
			marksArray[2]=maths;

		}
		
	    averageMark=((physics+chemistry+maths)*100)/300;
		percentagesArray[i]=averageMark;
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
		
		System.out.println("Marks of student "+(i+1)+" are "+marksArray[0]+" , "+marksArray[1]+" ' "+marksArray[2] );
		System.out.println("Percentage of student "+(i+1)+" is "+percentagesArray[i]);
        System.out.println("Grade of student "+(i+1)+" is "+gradesArray[i]);		
		}
		
		
		
		sc.close();
    }
}
